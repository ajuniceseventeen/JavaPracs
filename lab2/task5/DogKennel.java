package lab2.task5;

import java.util.Scanner;

public class DogKennel {
    private static Dog[] dogKenn;
    private static int indexArr = 0;
    public static void addDog(String name, int age)
    {
        dogKenn[indexArr] = new Dog(name, age);
        indexArr++;
    };

    public static void main(String[] args) {
        dogKenn = new Dog[20];
        Scanner in = new Scanner(System.in);
        int menu;
        do {
            System.out.println("1 - добавить собаку в питомник\n2 - узнать количество собак в питомнике\n(0 - выход)");
            menu = in.nextInt();
            switch (menu)
            {
                case 1:
                    System.out.println("Введите кличку и возраст собаки.");
                    String name = in.nextLine();
                    name = in.nextLine();
                    int age = in.nextInt();
                    addDog(name, age);
                    System.out.println(dogKenn[indexArr - 1]);
                    System.out.println("возраст на 'человеческий' = " + dogKenn[indexArr - 1].ageConverter());
                    break;
                case 2:
                    if (indexArr == 0)
                    {
                        System.out.println("в питомнике нет собак.");
                    }
                    else
                    {
                        System.out.println("собак в питомнике: " + indexArr);
                    }
                    break;
                default:
                    break;
            }
        } while(menu != 0);
    }
}