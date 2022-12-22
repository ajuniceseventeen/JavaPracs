package lab14;


public class task02 {
    public static void main(String[] args) {
        String str = new String("abcdefghijklmnopqrstuv18340");
        System.out.println(str.matches("abcdefghijklmnopqrstuv18340"));
        System.out.println(str.matches("abcdefghijklmnoasdfasdpqrstuv18340"));
    }
}
/*
a) abcdefghijklmnopqrstuv18340
b) abcdefghijklmnoasdfasdpqrstuv18340
*/
