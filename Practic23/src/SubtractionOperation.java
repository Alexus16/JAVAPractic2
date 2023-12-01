public class SubtractionOperation extends BinaryOperation{
    public SubtractionOperation(Operation left, Operation right)
    {
        super(left, right);
    }

    public double getValue(ParameterSet set)
    {
        return _left.getValue(set) - _right.getValue(set);
    }

    public void setLeft(Operation left)
    {
        _left = left;
    }

    public void setRight(Operation right)
    {
        _right = right;
    }
}