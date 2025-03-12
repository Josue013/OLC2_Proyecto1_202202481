using analyzer;

public class ForeignFunction : Invocable
{
    private Environment closure;
    private LanguageParser.FuncDClContext context;
    private string returnType;

    public ForeignFunction(Environment closure, LanguageParser.FuncDClContext context)
    {
        this.closure = closure;
        this.context = context;
        this.returnType = context.type()?.GetText(); // Puede ser null si no hay tipo de retorno
    }

    public int Arity()
    {
        if (context.@params() == null)
        {
            return 0;
        }
        return context.@params().ID().Length;
    }

    public ValueWrapper Invoke(List<ValueWrapper> args, CompilerVisitor visitor)
    {
        var newEnv = new Environment(closure);
        var beforeCallEnv = visitor.currentEnvironment;
        visitor.currentEnvironment = newEnv;

        try
        {
            // Validar parámetros
            if (context.@params() != null)
            {
                for (int i = 0; i < context.@params().ID().Length; i++)
                {
                    string paramName = context.@params().ID(i).GetText();
                    string paramType = context.@params().type(i).GetText();

                    // Verificar que no haya parámetros duplicados
                    if (newEnv.variables.ContainsKey(paramName))
                    {
                        throw new Exception($"Error: Parámetro duplicado '{paramName}'");
                    }

                    // Verificar que el tipo del argumento coincida
                    if (!visitor.IsCompatibleType(args[i], paramType))
                    {
                        throw new Exception($"Error: El argumento {i+1} debe ser de tipo {paramType}");
                    }

                    newEnv.DeclareVariable(paramName, args[i], 0, 0);
                }
            }

            // Ejecutar el cuerpo de la función
            foreach (var stmt in context.dcl())
            {
                visitor.Visit(stmt);
            }

            visitor.currentEnvironment = beforeCallEnv;
            return visitor.defaultValue;
        }
        catch (ReturnException e)
        {
            // Validar tipo de retorno
            if (returnType != null)
            {
                if (!visitor.IsCompatibleType(e.Value, returnType))
                {
                    throw new Exception($"Error: La función debe retornar un valor de tipo {returnType}");
                }
            }
            else if (e.Value != visitor.defaultValue)
            {
                throw new Exception("Error: La función no debe retornar un valor");
            }

            visitor.currentEnvironment = beforeCallEnv;
            return e.Value;
        }
        catch (Exception ex)
        {
            visitor.currentEnvironment = beforeCallEnv;
            throw ex;
        }
    }
}