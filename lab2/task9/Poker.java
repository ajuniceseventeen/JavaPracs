package lab2.task9;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        String[] suit = {"♠","♥","♣","♦"};
        String[] value = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        // создание колоды карт 52
        String[] deck = new String[suit.length * value.length];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck[suit.length * i + j] = value[i] + suit[j];
            }
        }
        // перемешивание колоды с помощью random
        for(int i = 0; i < suit.length * value.length; i++) {
            int index = rnd.nextInt(i + 1);
            String a = deck[index];
            deck[index] = deck[i];
            deck[i] = a;
        }
        // ввод кол-ва участников
        System.out.print("n = ");
        int n = in.nextInt();
        System.out.println("\nРаздача для " + n + " игроков!\n");
        for (int i = 0; i < n * 5; i++) {
            if (i != 0 && i % 5 == 0) {
                System.out.println("\n");
            }
            System.out.print(deck[i] + "   ");
        }
    }
}

