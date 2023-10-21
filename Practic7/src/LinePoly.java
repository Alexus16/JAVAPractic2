public class LinePoly implements MathCalculable{
    private double a, b;
    public LinePoly(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public double getA()
    {
        return a;
    }
    public double getB()
    {
        return b;
    }

    public void setA(double a)
    {
        this.a = a;
    }
    public void setB(double b)
    {
        this.b = b;
    }

    @Override
    public double Calculate(double x) {
        return a*x + b;
    }

    @Override
    public String toString() {
        return String.format("%.3fx + %.3f", a, b);
    }
}
