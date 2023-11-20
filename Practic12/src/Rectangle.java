import java.awt.*;

public class Rectangle implements Shape{
    public Rectangle(int x, int y, int width, int height, Color c)
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
        g.fillOval(_x, _y, _width, _height);
    }
}
