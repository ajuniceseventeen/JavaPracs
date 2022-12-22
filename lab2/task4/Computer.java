package lab2.task4;

public class Computer {
    private int price;
    private String name;

    public Computer(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer { " +
                "price = " + price +
                ", name = " + name +
                " } ";
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
