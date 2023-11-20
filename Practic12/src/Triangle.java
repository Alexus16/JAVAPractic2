import java.awt.*;

public class Triangle implements Shape{
    public Triangle(int x, int y, int width, int height, Color c)
    {
        _x = x;
        _y = y;
        _width = width;
        _height = height;
        _color = c;
    }
    private int _x;
    private int _y;
    private int _width;
    private int _height;
    private Color _color;

    @Override
    public void DrawOnGraphics(Graphics g) {
        g.setColor(_color);
        Polygon t = new Polygon();
        t.addPoint(_x, _y + _height);
        t.addPoint(_x + _width / 2, _y);
        t.addPoint(_x + _width, _y + _height);
        g.fillPolygon(t);
    }
}
