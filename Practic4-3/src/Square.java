public class Square extends Rectangle{
    public Square()
    {
        this(1);
    }

    public Square(double side)
    {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double side)
    {
        this.height = side;
        this.width = side;
    }

    public double getSide()
    {
        return this.height;
    }

    @Override
    public void setWidth(double width)
    {
        setSide(width);
    }

    @Override
    public void setHeight(double height)
    {
        setSide(height);
    }

    @Override
    public String toString()
    {
        return String.format("%s цвета %s со стороной %.2f", (filled ? "Залитый квадрат" : "Квадрат"), getColor(), getSide());
    }
}
