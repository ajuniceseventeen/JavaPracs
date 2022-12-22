package lab7.task4;

public class TestMath {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        MathCalculable mc2 = new MathFunc();
        MathCalculable mc3 = new MathFunc();
        MathCalculable mc4 = new MathFunc();
        int d;
        double x, pi, c;
        d = mc1.Pow(4, 5);
        x = mc2.Abs(2, 3);
        pi = mc3.pi;
        c = mc4.Circ(6);
        System.out.println("Возведение в степень: " + d + "\nМодуль комплексного числа: " + x + "\nЧисло Пи: " + pi + "\nДлина окружности: " + c);

    }
}