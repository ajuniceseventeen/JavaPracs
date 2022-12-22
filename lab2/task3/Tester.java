package lab2.task3;

//import java.util.Scanner;
public class Tester {
    private static Circle[] circles = new Circle[20];
    private static int count = 0;

    public static void main(String[] args) {
        System.out.println("создадим 1-й объект класса Circle x5 y5 r5");
        circles[count] = new Circle(5,5,5);
        count++;
        System.out.println("создадим 2-й объект класса Circle x1 y2 r3");
        circles[count] = new Circle(1,2,3);
        count++;
        System.out.println("создадим 3-й объект класса Circle x2 y2 r10");
        circles[count] = new Circle(2,2,10);
        count++;
        System.out.println("Изменим значения {x,y} 2-го объекта");
        Point secondPoint = new Point(4.5,5.4);
        circles[1].setPoint(secondPoint);
        for (int i = 1; i <= count; i++)
        {
            System.out.println(circles[i - 1]);
        }
    }
}
