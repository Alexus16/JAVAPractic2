import javax.swing.*;
import java.awt.*;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Random;

public class RandomDrawer extends JPanel {
    private HashMap<Integer, Color> colors = new HashMap<>();

    public RandomDrawer()
    {
        colors.put(1, Color.BLACK);
        colors.put(2, Color.BLUE);
        colors.put(3, Color.GREEN);
        colors.put(4, Color.RED);
        colors.put(5, Color.YELLOW);
        colors.put(6, Color.CYAN);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Random rnd = new Random();
        for(int i = 0; i < 20; i++)
        {
            int x = rnd.nextInt(800);
            int y = rnd.nextInt(600);
            int w = 30 + rnd.nextInt(90);
            int h = 30 + rnd.nextInt(90);
            Color c = getRandomColor(rnd);
            int shSelector = rnd.nextInt(3);
            Shape shape;
            switch (shSelector)
            {
                case 0:
                    shape = new Circle(x, y, h, w, c);
                    break;
                case 1:
                    shape = new Triangle(x, y, h, w, c);
                    break;
                default:
                case 2:
                    shape = new Rectangle(x, y, h, w, c);
                    break;
            }
            shape.DrawOnGraphics(g);
        }
    }

    private Color getRandomColor(Random rnd)
    {
        return colors.get(rnd.nextInt(colors.size()));
    }
}
