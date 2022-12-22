package lab2.task1;

//import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        String secondEmail= "1234567@dsa.com";
        Author author = new Author("Badma2004200", "rasiavau13@asd.com", 'm');
        //Scanner in = new Scanner(System.in);
        System.out.println("\nname - " + author.getName());
        System.out.println("gender - " + author.getGender());
        System.out.println("email - " + author.getEmail());
        System.out.println("изменим email");
        author.setEmail(secondEmail);
        System.out.println(author);
    }
}