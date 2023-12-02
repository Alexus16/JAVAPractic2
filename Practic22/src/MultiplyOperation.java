public class MultiplyOperation  implements BinaryOperation{
    private Operation _left;
    private Operation _right;

    public double getValue()
    {
        return _left.getValue() * _right.getValue();
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