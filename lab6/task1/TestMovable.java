package lab6.task1;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0,0,2,4);
        System.out.println(point);
        point.moveUp();
        point.moveLeft();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(1,6,5,4,5);
        System.out.println(circle);
        circle.moveUp();
        circle.moveRight();
        System.out.println(circle);
    }
}
