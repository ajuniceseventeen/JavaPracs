package lab6.task8;

import lab6.task6.Printable;

public class Shop implements Printable {
    private String name;
    private int price;

    public Shop(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public void print() {
        System.out.println("Shop {name=" + name + ", price=" + price + "}");
    }
}