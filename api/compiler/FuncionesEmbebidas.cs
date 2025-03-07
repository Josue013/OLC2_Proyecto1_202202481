public class FuncionesEmbebidas
{
  public static void Generar(Environment env)
  {
    env.DeclareVariable("time", new FunctionValue(new TimeEmbebida(), "time"), 0,0);
    env.DeclareVariable("strconv.Atoi", new FunctionValue(new AtoiEmbebida(), "strconv.Atoi"), 0,0);
    env.DeclareVariable("strconv.ParseFloat", new FunctionValue(new ParseFloatEmbebida(), "strconv.ParseFloat"), 0,0);

  }
}

public class TimeEmbebida : Invocable
{
  public int Arity() => 0;

  public ValueWrapper Invoke(List<ValueWrapper> args, CompilerVisitor visitor)
  {
    return new StringValue(DateTime.Now.ToString());
  }
}

public class AtoiEmbebida : Invocable
{
    public int Arity() => 1;

    public ValueWrapper Invoke(List<ValueWrapper> args, CompilerVisitor visitor)
    {
        try
        {
            if (args[0] is not StringValue sv)
            {
                throw new Exception("Error: strconv.Atoi espera una cadena como argumento");
            }

            // Verificar si la cadena contiene un punto decimal
            if (sv.Value.Contains('.'))
            {
                throw new Exception($"Error: strconv.Atoi: '{sv.Value}' contiene un punto decimal");
            }

            // Intentar convertir a entero
            if (int.TryParse(sv.Value, out int result))
            {
                return new IntValue(result);
            }

            throw new Exception($"Error: strconv.Atoi: '{sv.Value}' no es un número válido");
        }
        catch (Exception ex)
        {
            visitor.errores.Add(new Errores("Semantico", ex.Message, 0, 0));
            return new VoidValue();
        }
    }
}

public class ParseFloatEmbebida : Invocable
{
    public int Arity() => 1;

    public ValueWrapper Invoke(List<ValueWrapper> args, CompilerVisitor visitor)
    {
        try
        {
            if (args[0] is not StringValue sv)
            {
                throw new Exception("Error: strconv.ParseFloat espera una cadena como argumento");
            }

            // Intentar convertir a decimal
            if (decimal.TryParse(sv.Value, out decimal result))
            {
                return new DecimalValue(result);
            }

            throw new Exception($"Error: strconv.ParseFloat: '{sv.Value}' no es un número válido");
        }
        catch (Exception ex)
        {
            visitor.errores.Add(new Errores("Semantico", ex.Message, 0, 0));
            return new VoidValue();
        }
    }
}
