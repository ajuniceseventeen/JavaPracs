package lab11.Task5;

//  Сравнить время выполнения кода в реализации кода в виде различных структур данных
//  из предыдущих заданий (сравнить ArrayList и LinkedList по производительности –
//    операции вставки,
//    удаления,
//    добавления,
//    и поиска по образцу)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task5 {

    public static void main(String[] args) {
        var rand = new Random();
        var array = new ArrayList<Integer>();
        var linked = new LinkedList<Integer>();
        for (int i = 100; i >= 0; i--) {
            var num = i;
            array.add(num);
            linked.add(num);
        }
        var time = System.nanoTime();
        array.add(50, 420);
        System.out.printf("Вставка в ArrayList: %d нс\n", System.nanoTime() - time);

        time = System.nanoTime();
        linked.add(50, 420);
        System.out.printf("Вставка в LinkedList: %d нс\n", System.nanoTime() - time);

        time = System.nanoTime();
        array.remove(50);
        System.out.printf("Удаление из ArrayList: %d нс\n", System.nanoTime() - time);

        time = System.nanoTime();
        linked.remove(50);
        System.out.printf("Удаление из LinkedList: %d нс\n", System.nanoTime() - time);

        time = System.nanoTime();
        array.add(100);
        System.out.printf("Добавление в ArrayList: %d нс\n", System.nanoTime() - time);

        time = System.nanoTime();
        linked.add(100);
        System.out.printf("Добавление в LinkedList: %d нс\n", System.nanoTime() - time);

        time = System.nanoTime();
        array.indexOf(99);
        System.out.printf("Поиск в ArrayList: %d нс\n", System.nanoTime() - time);

        time = System.nanoTime();
        linked.indexOf(99);
        System.out.printf("Поиск в LinkedList: %d нс\n", System.nanoTime() - time);

    }
}
