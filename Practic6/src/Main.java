public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(1, 1, 2);
        circle.moveUp();
        System.out.println(circle);
        circle.moveLeft();
        System.out.println(circle);
        circle.moveRight();
        System.out.println(circle);
        MovablePoint point = new MovablePoint(1, 2);
        point.moveUp();
        System.out.println(point);
        point.moveLeft();
        System.out.println(point);
        point.moveRight();
        System.out.println(point);
    }
}