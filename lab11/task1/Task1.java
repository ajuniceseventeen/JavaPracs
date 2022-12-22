package lab11.task1;

//Написать программу, выводящую фамилию разработчика,
//дату и время получения задания, а также дату и время
//сдачи задания. Для получения последней даты и времени
//использовать класс Date из пакета java.util.*
//(Объявление Dated=newDate() или метод System.currentTimeMillis().

import java.util.*;
import java.text.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calendar cal = Calendar.getInstance();
        System.out.println("Дата получения задания: ");

        System.out.print("Год: ");
        cal.set(Calendar.YEAR, sc.nextInt());

        System.out.print("Месяц: ");
        cal.set(Calendar.MONTH, sc.nextInt() - 1);

        System.out.print("День: " );
        cal.set(Calendar.DAY_OF_MONTH, sc.nextInt());

        System.out.print("Часы: ");
        cal.set(Calendar.HOUR_OF_DAY, sc.nextInt());

        System.out.print("Минуты: ");
        cal.set(Calendar.MINUTE, sc.nextInt());

        System.out.print("Секунды: ");
        cal.set(Calendar.SECOND, sc.nextInt());


        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");

        System.out.print("Задание получено: ");
        System.out.println(dateFormatter.format(cal.getTime()));

        Date dateTo = new Date();
        System.out.println("Задание готово " + dateFormatter.format(dateTo));
    }
}
