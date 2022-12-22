package lab8.task3;

public class ABrec {
    public static String recursion(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии
            return a + " " + recursion(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии
            return a + " " + recursion(a + 1, b);
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(10, 15));
    }
}
