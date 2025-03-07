using System.Collections.Generic;

namespace api.compiler
{
    public record SliceValue : ValueWrapper
    {
        public List<ValueWrapper> Values { get; init; }
        public string Type { get; init; }

        public SliceValue(string type)
        {
            Type = type;
            Values = new List<ValueWrapper>();
        }

        public SliceValue(string type, List<ValueWrapper> values)
        {
            Type = type;
            Values = values;
        }

        public override string ToString()
        {
            return $"[{string.Join(", ", Values)}]";
        }

        // Para mantener la inmutabilidad del record, creamos un método para agregar valores
        public SliceValue AddValue(ValueWrapper value)
        {
            var newValues = new List<ValueWrapper>(Values) { value };
            return new SliceValue(Type, newValues);
        }

        // Método para modificar un valor en un índice específico
        public SliceValue SetValue(int index, ValueWrapper value)
        {
            if (index < 0 || index >= Values.Count)
            {
                throw new System.Exception($"Índice {index} fuera de rango");
            }

            var newValues = new List<ValueWrapper>(Values);
            newValues[index] = value;
            return new SliceValue(Type, newValues);
        }
    }
}