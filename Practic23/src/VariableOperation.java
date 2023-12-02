public class VariableOperation implements Operation {

    private String _varName;

    public VariableOperation(String varName)
    {
        _varName = varName;
    }

    public double getValue(ParameterSet set) {
        return set.GetValueOfVariable(_varName);
    }
}
