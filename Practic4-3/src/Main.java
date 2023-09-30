public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]
                {
                        new Circle(3, "black", true),
                        new Rectangle(3, 2, "blue", false),
                        new Square(5, "green", true),
                        new Circle(),
                        new Rectangle(),
                        new Square(),
                };
        for(var s : shapes)
        {
            System.out.printf("%s Area: %.2f Perimeter: %.2f\n\r", s, s.getArea(), s.getPerimeter());
        }
    }
}