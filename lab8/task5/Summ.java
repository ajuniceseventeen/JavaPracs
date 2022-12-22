package lab8.task5;

public class Summ {
    public static int recursion(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + recursion(n / 10);
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(1553));
    }
}
