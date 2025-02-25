public class Environment
{

    public Dictionary<string, ValueWrapper> variables = new Dictionary<string, ValueWrapper>();
    public Environment? parent;

    public Environment(Environment? parent)
    {
        this.parent = parent;
    }

    public ValueWrapper GetVariable(string id)
    {
        if (variables.ContainsKey(id))
        {
            return variables[id];
        }
        
        // Si no se encuentra la variable en el entorno actual se busca en el entorno padre
        if (parent != null)
        {
            return parent.GetVariable(id);
        }

        throw new Exception("Variable " + id + " not found");
    }

    public void DeclareVariable(string id, ValueWrapper value)
    {
        if (variables.ContainsKey(id))
        {
            throw new Exception("La Variable " + id + " ya ha sido declarada anteriormente");
        }
        else
        {
            variables[id] = value;
        }
    }

    public ValueWrapper AssignVariable(string id, ValueWrapper value)
    {
        if (variables.ContainsKey(id))
        {
            variables[id] = value;
            return value;
        }

        // Si no se encuentra la variable en el entorno actual se busca en el entorno padre
        if (parent != null)
        {
            return parent.AssignVariable(id, value);
        }

        throw new Exception("Variable " + id + " not found");
    }

}