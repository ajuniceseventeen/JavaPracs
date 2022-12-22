package lab11.task4;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var year = scanner.nextInt();
        var month = scanner.nextInt();
        var day = scanner.nextInt();
        var hours = scanner.nextInt();
        var mins = scanner.nextInt();
        Date date = new Date();
        Calendar calendar = new GregorianCalendar(year, month, day);
        calendar.set(Calendar.HOUR, hours);
        calendar.set(Calendar.MINUTE, mins);
        System.out.println("Введенная дата");
        System.out.println(calendar.getTime());
    }
}
 /*   Напишите пользовательский код, который формирует объекты Date и
        Calendar по следующим данным, вводимым пользователем:
<Год><Месяц><Число>
<Часы><минуты>   */