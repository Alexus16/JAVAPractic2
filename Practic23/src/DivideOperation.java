public class DivideOperation extends BinaryOperation{

    public DivideOperation(Operation left, Operation right)
    {
        super(left, right);
    }

    public double getValue(ParameterSet set)
    {
        return _left.getValue(set) / _right.getValue(set);
    }
}