
public class TestBall {
    public void Test()
    {
        System.out.println("Creating default ball");
        Ball defball = new Ball();
        System.out.println(defball);
        System.out.println("Creating ball at coords (2, 2)");
        Ball ball = new Ball(2, 2);
        System.out.println(ball);
        System.out.println("Setting X to 1");
        ball.setX(1);
        System.out.println(ball);
        System.out.println("Setting Y to 1");
        ball.setY(1);
        System.out.println(ball);
        System.out.println("Setting XY to (3, 3)");
        ball.setXY(3, 3);
        System.out.println(ball);
        System.out.println("Moving ball at 3,3");
        ball.move(3, 3);
        System.out.println(ball);
        System.out.println("Testing getX");
        System.out.println(ball.getX());
        System.out.println("Testing getY");
        System.out.println(ball.getY());
    }
}
