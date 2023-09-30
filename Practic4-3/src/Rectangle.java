public class Rectangle extends Shape{
    protected double width;
    protected double height;
    public Rectangle()
    {
        this(1,1);
    }

    public Rectangle(double width, double height)
    {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth()
    {
        return this.width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return this.height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public String toString() {
        return String.format("%s цвета %s с размерами %.2f на %.2f", (filled ? "Залитый прямоугольник" : "Прямоугольник"), getColor(), getWidth(), getHeight());
    }
}
