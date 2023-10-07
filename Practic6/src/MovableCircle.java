public class MovableCircle implements Movable {
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int radius)
    {
        center = new MovablePoint(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Круг с центром в (%d, %d) и радиусом %d движется со скоростью (%d, %d)",
                center.getX(),
                center.getY(),
                getRadius(),
                center.getSpeedX(),
                center.getSpeedY());
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public void setX(int x)
    {
        this.center.setX(x);
    }

    public int getX()
    {
        return this.center.getX();
    }

    public void setY(int y)
    {
        this.center.setY(y);
    }

    public int getY()
    {
        return this.center.getY();
    }

    public void setSpeedX(int speedX)
    {
        this.center.setSpeedX(speedX);
    }

    public int getSpeedX()
    {
        return this.center.getSpeedX();
    }

    public void setSpeedY(int speedY)
    {
        this.center.setSpeedY(speedY);
    }

    public int getSpeedY()
    {
        return this.center.getSpeedY();
    }

    @Override
    public void moveUp() {
        this.center.moveUp();
    }

    @Override
    public void moveDown() {
        this.center.moveDown();
    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }

    @Override
    public void moveRight() {
        this.center.moveRight();
    }
}
