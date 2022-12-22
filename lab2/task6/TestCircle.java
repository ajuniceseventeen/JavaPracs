package lab2.task6;

import lab2.task3.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle firstCircle = new Circle(5,5,10);
        Circle secondCircle = new Circle(6,7,12);
        System.out.println("1-й круг: " + firstCircle);
        System.out.println("Площадь = " + firstCircle.getArea() + "\nДлина = " + firstCircle.getLength());

        System.out.println("2-й круг: " + secondCircle);
        System.out.println("Площадь = " + secondCircle.getArea() + "\nДлина = " + secondCircle.getLength());

        System.out.println("\nСравним их.");
        firstCircle.circleComparsion(secondCircle);
    }
}
