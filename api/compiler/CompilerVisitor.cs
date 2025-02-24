
using analyzer;
using Antlr4.Runtime.Misc;


public class CompilerVisitor : LanguageBaseVisitor<ValueWrapper>
{

    private ValueWrapper defaultValue = new VoidValue();
    public string output = "";
    private Environment currentEnvironment = new Environment();
    public List<Errores> errores = new List<Errores>();

    // VisitProgram
    public override ValueWrapper VisitProgram(LanguageParser.ProgramContext context)
    {
        foreach (var dcl in context.dcl())
        {
            Visit(dcl);
        }
        return defaultValue;
    }

    // VisitVarDcl
    public override ValueWrapper VisitVarDcl(LanguageParser.VarDclContext context)
    {
        string id = context.ID().GetText();
        string type = context.type().GetText();

        if (context.expr() == null)
        {
            // Valor por defecto
            currentEnvironment.DeclareVariable(id, ValorPorDefecto(type));
            return defaultValue;
        }
        else
        {
            // Valor asignado
            ValueWrapper value = Visit(context.expr());
            currentEnvironment.DeclareVariable(id, value);
            return defaultValue;
        }
    }

    // Valores por defecto
    public ValueWrapper ValorPorDefecto(string type)
    {
        return type switch
        {
            "int" => new IntValue(0),
            "float64" => new DecimalValue(0),
            "bool" => new BoolValue(false),
            "string" => new StringValue(""),
            "rune" => new RuneValue('\0'),

            _ => throw new System.Exception("Tipo invalido")
        };
    }

    // VisitAssign
    public override ValueWrapper VisitAssign(LanguageParser.AssignContext context)
    {
        string id = context.ID().GetText();
        string signo = context.GetChild(1).GetText();
        ValueWrapper value = Visit(context.expr());

        try
        {
            if (signo == ":=")
            {
                if (currentEnvironment.variables.ContainsKey(id))
                {
                    throw new Exception("Error: La variable " + id + " ya ha sido declarada.");
                }

                currentEnvironment.DeclareVariable(id, value);
                Console.WriteLine("Nombre de la variable: " + id + " valor: " + value);
            }
            else if (signo == "=")
            {
                if (!currentEnvironment.variables.ContainsKey(id))
                {
                    throw new Exception("Error: La variable " + id + " no ha sido declarada.");
                }

                var valorAntiguo = currentEnvironment.GetVariable(id);

                if (valorAntiguo.GetType() != value.GetType())
                {
                    throw new Exception("Error: El tipo de dato de la variable " + id + " no coincide.");
                    //errores.Add(new Errores("Error", "El tipo de dato de la variable " + id + " no coincide.", context.Start.Line, context.Start.Column));
                }
                else
                {
                    Console.WriteLine("La variable " + id + " cambio de valor de " + valorAntiguo + " a " + value);
                    currentEnvironment.AssignVariable(id, value);
                }
            }
        }
        catch (Exception ex)
        {
            System.Console.WriteLine(ex.Message);
            errores.Add(new Errores("Semantico", ex.Message, context.Start.Line, context.Start.Column));
        }

        return value;
    }
    // VisitExprStmt
    public override ValueWrapper VisitExprStmt(LanguageParser.ExprStmtContext context)
    {
        return Visit(context.expr());
    }

    // VisitPrintStmt
public override ValueWrapper VisitPrintStmt(LanguageParser.PrintStmtContext context)
{
    bool flag = false;

    // Recorrer cada expresion
    foreach (var expr in context.exprList().expr())
    {
        // Parsear la salida
        ValueWrapper value = Visit(expr);
        switch (value)
        {
            case IntValue i:
                output += i.Value.ToString();
                flag = true;
                break;
            case DecimalValue d:
                output += d.Value.ToString();
                flag = true;
                break;
            case BoolValue b:
                output += b.Value.ToString();
                flag = true;
                break;
            case StringValue s:
                output += s.Value;
                flag = true;
                break;
            case RuneValue r:
                output += r.Value.ToString();
                flag = true;
                break;
            case VoidValue:
                // No hacer nada para VoidValue
                break;
            default:
                throw new System.Exception($"No se puede imprimir el valor {value}");
        }
        if (flag)
        {
            output += " ";
        }
    }

    if (flag)
    {
        output += "\n";
    }

    return defaultValue;
}

    // VisitIdentifier
    public override ValueWrapper VisitIdentifier(LanguageParser.IdentifierContext context)
    {
        string id = context.ID().GetText();
        return currentEnvironment.GetVariable(id);
    }

    // VisitParens
    public override ValueWrapper VisitParens(LanguageParser.ParensContext context)
    {
        return Visit(context.expr());
    }

    // VisitNegate
    public override ValueWrapper VisitNegate(LanguageParser.NegateContext context)
    {
        ValueWrapper value = Visit(context.expr());
        return value switch
        {
            // -IntValue
            IntValue i => new IntValue(-i.Value),
            // -DecimalValue
            DecimalValue d => new DecimalValue(-d.Value),

            _ => throw new System.Exception("Operacion invalida")
        };
    }

    // VisitInt
    public override ValueWrapper VisitInt(LanguageParser.IntContext context)
    {
        return new IntValue(int.Parse(context.INT().GetText()));
    }

    // VisitDecimal
    public override ValueWrapper VisitDecimal(LanguageParser.DecimalContext context)
    {
        return new DecimalValue(decimal.Parse(context.DECIMAL().GetText()));
    }

    // VisitBool
    public override ValueWrapper VisitBool(LanguageParser.BoolContext context)
    {
        return new BoolValue(bool.Parse(context.BOOL().GetText()));
    }

    // VisitString
    public override ValueWrapper VisitString(LanguageParser.StringContext context)
    {
        string text = context.STRING().GetText().Trim('"');

        // Remplaza las secuencias de escape
        text = text.Replace("\\n", "\n")
                .Replace("\\t", "\t")
                .Replace("\\r", "\r")
                .Replace("\\\"", "\"")
                .Replace("\\\\", "\\");

        return new StringValue(text);
    }

    // VisitRune
    public override ValueWrapper VisitRune(LanguageParser.RuneContext context)
    {
        string text = context.RUNE().GetText().Trim('\'');

        // Remplaza las secuencias de escape
        text = text.Replace("\\n", "\n")
                .Replace("\\t", "\t")
                .Replace("\\r", "\r")
                .Replace("\\\"", "\"")
                .Replace("\\\\", "\\");

        if (text.Length != 1)
        {
            throw new Exception("Error: Las literales de tipo rune deben contener un solo carácter.");
        }

        return new RuneValue(text[0]);
    }

    // VisitMulDiv
    public override ValueWrapper VisitMulDiv(LanguageParser.MulDivContext context)
    {
        ValueWrapper left = Visit(context.expr(0));
        ValueWrapper right = Visit(context.expr(1));

        var operador = context.op.Text;

        try
        {
            return (left, right, operador) switch
            {
                // ******** int ********
                // IntValue * IntValue
                (IntValue l, IntValue r, "*") => new IntValue(l.Value * r.Value),
                // IntValue / IntValue
                (IntValue l, IntValue r, "/") => new IntValue(l.Value / r.Value),
                // IntValue * DecimalValue
                (IntValue l, DecimalValue r, "*") => new DecimalValue(l.Value * r.Value),
                // IntValue / DecimalValue
                (IntValue l, DecimalValue r, "/") => new DecimalValue(l.Value / r.Value),

                // ******** decimal ********
                // DecimalValue * DecimalValue
                (DecimalValue l, DecimalValue r, "*") => new DecimalValue(l.Value * r.Value),
                // DecimalValue / DecimalValue
                (DecimalValue l, DecimalValue r, "/") => new DecimalValue(l.Value / r.Value),
                // DecimalValue * IntValue
                (DecimalValue l, IntValue r, "*") => new DecimalValue(l.Value * r.Value),
                // DecimalValue / IntValue
                (DecimalValue l, IntValue r, "/") => new DecimalValue(l.Value / r.Value),
                _ => throw new System.Exception($"No se puede realizar la operacion {left.GetType()} {operador} {right.GetType()}")
            };
        }
        catch (Exception ex)
        {
            System.Console.WriteLine(ex.Message);
            errores.Add(new Errores("Semantico", ex.Message, context.Start.Line, context.Start.Column));
            return defaultValue;
        }
    }

    // VisitAddSub
    public override ValueWrapper VisitAddSub(LanguageParser.AddSubContext context)
    {
        ValueWrapper left = Visit(context.GetChild(0));
        ValueWrapper right = Visit(context.expr(1));

        var operador = context.op.Text;

        try
        {
            return (left, right, operador) switch
            {
                // ******** int ********
                // IntValue + IntValue
                (IntValue l, IntValue r, "+") => new IntValue(l.Value + r.Value),
                // IntValue - IntValue
                (IntValue l, IntValue r, "-") => new IntValue(l.Value - r.Value),
                // IntValue + DecimalValue
                (IntValue l, DecimalValue r, "+") => new DecimalValue(l.Value + r.Value),
                // IntValue - DecimalValue
                (IntValue l, DecimalValue r, "-") => new DecimalValue(l.Value - r.Value),

                // ******** decimal ********
                // DecimalValue + DecimalValue
                (DecimalValue l, DecimalValue r, "+") => new DecimalValue(l.Value + r.Value),
                // DecimalValue - DecimalValue
                (DecimalValue l, DecimalValue r, "-") => new DecimalValue(l.Value - r.Value),
                // DecimalValue + IntValue
                (DecimalValue l, IntValue r, "+") => new DecimalValue(l.Value + r.Value),
                // DecimalValue - IntValue
                (DecimalValue l, IntValue r, "-") => new DecimalValue(l.Value - r.Value),

                // ******** string ********
                // StringValue + StringValue
                (StringValue l, StringValue r, "+") => new StringValue(l.Value + r.Value),

                _ => throw new System.Exception($"No se puede realizar la operacion {left.GetType()} {operador} {right.GetType()}")
            };
        }
        catch (Exception ex)
        {
            System.Console.WriteLine(ex.Message);
            errores.Add(new Errores("Semantico", ex.Message, context.Start.Line, context.Start.Column));
            return defaultValue;
        }
    }

    // VisitMod
    public override ValueWrapper VisitMod(LanguageParser.ModContext context)
    {
        ValueWrapper left = Visit(context.expr(0));
        ValueWrapper right = Visit(context.expr(1));

        try
        {
            return (left, right) switch
            {
                // IntValue % IntValue
                (IntValue l, IntValue r) => new IntValue(l.Value % r.Value),
                _ => throw new System.Exception("Operacion invalida")
            };
        }
        catch (Exception ex)
        {
            System.Console.WriteLine(ex.Message);
            errores.Add(new Errores("Semantico", ex.Message, context.Start.Line, context.Start.Column));
            return defaultValue;
        }
    }

    // VisitAddAssign
    public override ValueWrapper VisitAddAssign(LanguageParser.AddAssignContext context)
    {
        string id = context.ID().GetText();
        ValueWrapper value = Visit(context.expr());

        try
        {
            ValueWrapper currentValue = currentEnvironment.GetVariable(id);

            ValueWrapper newValue = (currentValue, value) switch
            {
                (IntValue l, IntValue r) => new IntValue(l.Value + r.Value),
                (DecimalValue l, IntValue r) => new DecimalValue(l.Value + r.Value),
                (DecimalValue l, DecimalValue r) => new DecimalValue(l.Value + r.Value),
                (StringValue l, StringValue r) => new StringValue(l.Value + r.Value),

                _ => throw new System.Exception($"No se puede realizar la operacion {currentValue.GetType()} += {value.GetType()}")
            };

            return currentEnvironment.AssignVariable(id, newValue);
        }
        catch (Exception ex)
        {
            System.Console.WriteLine(ex.Message);
            errores.Add(new Errores("Semantico", ex.Message, context.Start.Line, context.Start.Column));
            return defaultValue;
        }
    }

    // VisitSubAssign
    public override ValueWrapper VisitSubAssign(LanguageParser.SubAssignContext context)
    {
        string id = context.ID().GetText();
        ValueWrapper value = Visit(context.expr());

        try
        {
            ValueWrapper currentValue = currentEnvironment.GetVariable(id);

            ValueWrapper newValue = (currentValue, value) switch
            {
                (IntValue l, IntValue r) => new IntValue(l.Value - r.Value),
                (IntValue l, DecimalValue r) => new DecimalValue(l.Value - r.Value),
                (DecimalValue l, IntValue r) => new DecimalValue(l.Value - r.Value),
                (DecimalValue l, DecimalValue r) => new DecimalValue(l.Value - r.Value),

                _ => throw new System.Exception("Operacion invalida")
            };

            return currentEnvironment.AssignVariable(id, newValue);
        }
        catch (Exception ex)
        {
            System.Console.WriteLine(ex.Message);
            errores.Add(new Errores("Semantico", ex.Message, context.Start.Line, context.Start.Column));
            return defaultValue;
        }
    }

    // VisitRelational
    public override ValueWrapper VisitRelational(LanguageParser.RelationalContext context)
    {
        ValueWrapper left = Visit(context.expr(0));
        ValueWrapper right = Visit(context.expr(1));

        var operador = context.op.Text;

        try
        {
            return (left, right, operador) switch
            {
                // ******** int ********
                // IntValue < IntValue
                (IntValue l, IntValue r, "<") => new BoolValue(l.Value < r.Value),
                // IntValue > IntValue
                (IntValue l, IntValue r, ">") => new BoolValue(l.Value > r.Value),
                // IntValue <= IntValue
                (IntValue l, IntValue r, "<=") => new BoolValue(l.Value <= r.Value),
                // IntValue >= IntValue
                (IntValue l, IntValue r, ">=") => new BoolValue(l.Value >= r.Value),
                // IntValue > DecimalValue
                (IntValue l, DecimalValue r, ">") => new BoolValue(l.Value > r.Value),
                // IntValue < DecimalValue
                (IntValue l, DecimalValue r, "<") => new BoolValue(l.Value < r.Value),
                // IntValue >= DecimalValue
                (IntValue l, DecimalValue r, ">=") => new BoolValue(l.Value >= r.Value),
                // IntValue <= DecimalValue
                (IntValue l, DecimalValue r, "<=") => new BoolValue(l.Value <= r.Value),

                // ******** decimal ********
                // DecimalValue < DecimalValue
                (DecimalValue l, DecimalValue r, "<") => new BoolValue(l.Value < r.Value),
                // DecimalValue > DecimalValue
                (DecimalValue l, DecimalValue r, ">") => new BoolValue(l.Value > r.Value),
                // DecimalValue <= DecimalValue
                (DecimalValue l, DecimalValue r, "<=") => new BoolValue(l.Value <= r.Value),
                // DecimalValue >= DecimalValue
                (DecimalValue l, DecimalValue r, ">=") => new BoolValue(l.Value >= r.Value),
                // DecimalValue > IntValue
                (DecimalValue l, IntValue r, ">") => new BoolValue(l.Value > r.Value),
                // DecimalValue < IntValue
                (DecimalValue l, IntValue r, "<") => new BoolValue(l.Value < r.Value),
                // DecimalValue >= IntValue
                (DecimalValue l, IntValue r, ">=") => new BoolValue(l.Value >= r.Value),
                // DecimalValue <= IntValue
                (DecimalValue l, IntValue r, "<=") => new BoolValue(l.Value <= r.Value),

                // ******** rune ********
                // RuneValue > RuneValue
                (RuneValue l, RuneValue r, ">") => new BoolValue(l.Value > r.Value),
                // RuneValue < RuneValue
                (RuneValue l, RuneValue r, "<") => new BoolValue(l.Value < r.Value),
                // RuneValue >= RuneValue
                (RuneValue l, RuneValue r, ">=") => new BoolValue(l.Value >= r.Value),
                // RuneValue <= RuneValue
                (RuneValue l, RuneValue r, "<=") => new BoolValue(l.Value <= r.Value),

                _ => throw new System.Exception("Operacion invalida")
            };
        }
        catch (Exception ex)
        {
            System.Console.WriteLine(ex.Message);
            errores.Add(new Errores("Semantico", ex.Message, context.Start.Line, context.Start.Column));
            return defaultValue;
        }
    }

    // VisitComparison
    public override ValueWrapper VisitComparison(LanguageParser.ComparisonContext context)
    {
        ValueWrapper left = Visit(context.expr(0));
        ValueWrapper right = Visit(context.expr(1));

        var operador = context.op.Text;

        try
        {
            return (left, right, operador) switch
            {
                // ******** int ********
                // IntValue == IntValue
                (IntValue l, IntValue r, "==") => new BoolValue(l.Value == r.Value),
                // IntValue != IntValue
                (IntValue l, IntValue r, "!=") => new BoolValue(l.Value != r.Value),
                // IntValue == DecimalValue
                (IntValue l, DecimalValue r, "==") => new BoolValue(l.Value == r.Value),
                // IntValue != DecimalValue
                (IntValue l, DecimalValue r, "!=") => new BoolValue(l.Value != r.Value),

                // ******** decimal ********
                // DecimalValue == DecimalValue
                (DecimalValue l, DecimalValue r, "==") => new BoolValue(l.Value == r.Value),
                // DecimalValue != DecimalValue
                (DecimalValue l, DecimalValue r, "!=") => new BoolValue(l.Value != r.Value),
                // DecimalValue == IntValue
                (DecimalValue l, IntValue r, "==") => new BoolValue(l.Value == r.Value),
                // DecimalValue != IntValue
                (DecimalValue l, IntValue r, "!=") => new BoolValue(l.Value != r.Value),

                // ******** bool ********
                // BoolValue == BoolValue
                (BoolValue l, BoolValue r, "==") => new BoolValue(l.Value == r.Value),
                // BoolValue != BoolValue
                (BoolValue l, BoolValue r, "!=") => new BoolValue(l.Value != r.Value),

                // ******** string ********
                // StringValue == StringValue
                (StringValue l, StringValue r, "==") => new BoolValue(l.Value == r.Value),
                // StringValue != StringValue
                (StringValue l, StringValue r, "!=") => new BoolValue(l.Value != r.Value),

                // ******** rune ********
                // RuneValue == RuneValue
                (RuneValue l, RuneValue r, "==") => new BoolValue(l.Value == r.Value),
                // RuneValue != RuneValue
                (RuneValue l, RuneValue r, "!=") => new BoolValue(l.Value != r.Value),

                _ => throw new System.Exception("Operacion invalida")
            };
        }
        catch (Exception ex)
        {
            System.Console.WriteLine(ex.Message);
            errores.Add(new Errores("Semantico", ex.Message, context.Start.Line, context.Start.Column));
            return defaultValue;
        }
    }



}