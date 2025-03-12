using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using analyzer;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using api.compiler;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;
using AstGenerator = api.compiler.ASTGenerator;

namespace api.Controllers
{
    [Route("[controller]")]
    public class Compile : Controller
    {
        private readonly ILogger<Compile> _logger;

        public Compile(ILogger<Compile> logger)
        {
            _logger = logger;
        }

        public class CompileRequest
        {
            [Required]
            public required string code { get; set; }
        }

        // POST /compile
        [HttpPost]
        public IActionResult Post([FromBody] CompileRequest request)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest(new { error = "Invalid request" });
            }


            Directory.CreateDirectory("Reportes");

            // Análisis léxico
            var inputStream = new AntlrInputStream(request.code);
            var lexer = new LanguageLexer(inputStream);
            var errorListener = new CustomErrorListener();
            lexer.RemoveErrorListeners();
            lexer.AddErrorListener(errorListener);

            // Análisis sintáctico
            var tokens = new CommonTokenStream(lexer);
            var parser = new LanguageParser(tokens);
            parser.RemoveErrorListeners();
            parser.AddErrorListener(errorListener);

            // Configurar el parser para que continue después de errores
            parser.ErrorHandler = new DefaultErrorStrategy();

            // Obtener el árbol y procesar
            var tree = parser.program();

            // Preparar archivos
            string dotFile = "Reportes/ReporteAST.dot";
            string imageFile = "Reportes/ReporteAST.svg";
            string errorFile = "Reportes/ReporteErrores.html";

            // Inicializar generador de reportes
            var errorReportGenerator = new ErrorReportGenerator();

            // Agregar errores léxicos y sintácticos
            var lexSynErrors = errorListener.GetErrores();
            foreach (var error in lexSynErrors)
            {
                errorReportGenerator.AddError(error);
            }

            // Ejecutar el visitor y obtener errores semánticos
            var visitor = new CompilerVisitor();
            visitor.Visit(tree);
            string output = visitor.output;

            // Agregar errores semánticos
            foreach (var error in visitor.GetAllErrors())
            {
                errorReportGenerator.AddError(error);

            }

            // Generar AST
            var astGenerator = new ASTGenerator();
            string dot = astGenerator.GenerateAST(tree, parser);
            astGenerator.SaveToFile(dot, dotFile);
            astGenerator.GenerateImage(dotFile, imageFile);

            // Generar reporte de errores
            errorReportGenerator.SaveToFile(errorFile);

            return Ok(new
            {
                result = output,
                ast = imageFile,
                errorReport = errorFile,
                hasErrors = errorListener.HasErrors() || visitor.errores.Count > 0,
                errors = lexSynErrors.Concat(visitor.errores).ToList()
            });


        }

    }
}