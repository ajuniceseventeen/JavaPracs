package lab7.task5;

public class TestStrings {
    public static void main(String[] args) {
        Strings strings = new FuncStrings();
        String s = "attention!";
        System.out.println(strings.length(s));
        System.out.println(strings.oddPos(s));
        System.out.println(strings.invert(s));
    }
}