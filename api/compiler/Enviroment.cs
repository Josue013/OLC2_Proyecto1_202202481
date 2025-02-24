public class Environment
{

    public Dictionary<string, ValueWrapper> variables = new Dictionary<string, ValueWrapper>();
    // TODO: parent environment

    public ValueWrapper GetVariable(string id)
    {
        if (variables.ContainsKey(id))
        {
            return variables[id];
        }
        else
        {
            throw new Exception("Variable " + id + " not found");
        }
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
        else
        {
            throw new Exception("Variable " + id + " not found");
        }
    }

}