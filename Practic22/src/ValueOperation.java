public class ValueOperation implements Operation{
    private double _value;
    public ValueOperation()
    {
        _value = 0;
    }

    public double getValue()
    {
        return _value;
    }

    public void setValue(double value)
    {
        _value = value;
    }
}
