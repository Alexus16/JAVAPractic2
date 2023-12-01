public abstract class BinaryOperation implements Operation {
    protected Operation _left;
    protected Operation _right;

    BinaryOperation(Operation left, Operation right)
    {
        _left = left;
        _right = right;
    }

    public void setLeft(Operation op)
    {
        _left = op;
    }
    public void setRight(Operation op)
    {
        _right = op;
    }
}
