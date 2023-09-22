public class Ball {
    private double x;
    private double y;

    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Ball()
    {
        this(0.0, 0.0);
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void setXY(double x, double y)
    {
        setX(x);
        setY(y);
    }

    public void move(double x, double y)
    {
        setXY(getX() + x, getY() + y);
    }

    public String toString()
    {
        return "Ball at coords (" + getX() + ", " + getY() + ")";
    }
}
