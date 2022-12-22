package lab2.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 1, n = 0;
        while (s.charAt(n) == ' ' && n < s.length())
        {
            n++;
        }
        for (int i = n; i < s.length() - 1; i++)
        {
            if (s.charAt(i) == ' ' && i != 0 && s.charAt(i - 1) != ' ')
                count++;
        }
        System.out.println(count);
    }
}