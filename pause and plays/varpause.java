//always start with importing our scanner so we can use it!
import java.util.Scanner;

public class varpause {
    public static void main(String[] args) {
        //I've already set up a scanner with the name 'sc' for you!
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println(12);

    String name = "Athina";
    Integer age = 19;
    System.out.println(name);
    System.out.println(name);
    System.out.println("My name is "+ name+ " and I am "+age +" years old.");

    System.out.println("What is your name?");
    String user = sc.nextLine();
    System.out.println("Welcome "+user+ "!");

    System.out.println("What is your first name?");
    String first = sc.nextLine();
    System.out.println("What is your last name?");
    String last = sc.nextLine();
    System.out.println("Welcome "+ first + " "+ last+ "!");
    }
}


