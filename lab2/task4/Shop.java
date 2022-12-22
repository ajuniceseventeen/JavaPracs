package lab2.task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    private static ArrayList <Computer> computerArrayList = new ArrayList<>();
    private static int countComp = 0;
    public static void addComp(int price, String name)
    {

        computerArrayList.add(new Computer(price, name));
        countComp++;
    }
    public static void deleteComp(int index)
    {
        computerArrayList.remove(index - 1);
        countComp--;
    }

    public static void findComp(int value1, int value2) {
        boolean flag = false;
        for(Computer test : computerArrayList) {
            if (test.getPrice() >= value1 && test.getPrice() <= value2) {
                flag = true;
                System.out.println("найдено в диапазоне: " + test);
            }
        }
        if (flag) {
            System.out.println("ничего не найдено");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int price, indexDelComp;
        String name;
        int menu;
        do {
            System.out.println("1 - добавить компьютер\n2 - удалить компьютер\n3 - найти компьютер по цене");
            menu = in.nextInt();
            switch (menu)
            {
                case 1:
                    System.out.print("цена = ");
                    price = in.nextInt();
                    System.out.print("название = ");
                    name = in.nextLine();
                    name = in.nextLine();
                    addComp(price, name);
                    break;
                case 2:
                    System.out.println("Выберите какой компьютер удалить: ");
                    System.out.println(computerArrayList);
                    indexDelComp = in.nextInt();
                    deleteComp(indexDelComp);
                    System.out.println(computerArrayList);
                    break;
                case 3:
                    System.out.print("введите диапазон цен\nот = ");
                    int value1 = 0, value2 = 0;
                    value1 = in.nextInt();
                    System.out.print("до = ");
                    value2 = in.nextInt();
                    findComp(value1, value2);
                    break;
                default:
                    break;
            }
        } while (menu != 0);
    }
}
