package lab2.task2;

//import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0.0, 0.0);
        //Scanner in = new Scanner(System.in);
        System.out.println("x = " + ball.getX());
        System.out.println("y = " + ball.getY());
        ball.move(1.5, 1.5);
        System.out.println(ball);
    }
}