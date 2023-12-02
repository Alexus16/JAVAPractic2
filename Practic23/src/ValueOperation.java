public class ValueOperation implements Operation{
    private double _value;
    public ValueOperation(double value)
    {
        _value = value;
    }

    public double getValue(ParameterSet set)
    {
        return _value;
    }

    public void setValue(double value)
    {
        _value = value;
    }
}
