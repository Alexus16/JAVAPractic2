public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int speedX;
    private int speedY;

    public MovablePoint(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.speedX = 0;
        this.speedY = 0;
    }

    @Override
    public String toString() {
        return String.format("Точка в координатах (%d, %d) и движется со скоростью (%d, %d)", x, y, speedX, speedY);
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getSpeedX()
    {
        return speedX;
    }

    public int getSpeedY()
    {
        return speedY;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setSpeedX(int speedX)
    {
        this.speedX = speedX;
    }

    public void setSpeedY(int speedY)
    {
        this.speedY = speedY;
    }

    @Override
    public void moveUp() {
        updateCoords();
        setSpeedX(0);
        setSpeedY(10);
    }

    @Override
    public void moveDown() {
        updateCoords();
        setSpeedX(0);
        setSpeedY(-10);
    }

    @Override
    public void moveLeft() {
        updateCoords();
        setSpeedX(-10);
        setSpeedY(0);
    }

    @Override
    public void moveRight() {
        updateCoords();
        setSpeedX(10);
        setSpeedY(0);
    }

    private void updateCoords()
    {
        this.x += this.speedX;
        this.y += this.speedY;
    }
}
