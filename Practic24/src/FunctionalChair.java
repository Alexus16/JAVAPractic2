public class FunctionalChair implements Chair{
    private int _a;
    private int _b;

    public FunctionalChair(int a, int b)
    {
        _a = a;
        _b = b;
    }

    public int sum()
    {
        return _a + _b;
    }

    public void sitOnChair() {
        System.out.println("Function");
        System.out.println(sum());
    }
}
