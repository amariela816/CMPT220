//always start with importing our scanner so we can use it!
import java.util.Scanner;

public class passplay {
    public static void main(String[] args) {
        //I've already set up a scanner with the name 'sc' for you!
        Scanner sc = new Scanner(System.in);
        
       
       System.out.println("What is the password?");
       String guess = sc.nextLine();
       
       while (guess == "Athina123"){
        System.out.println("Try again");
        System.out.println("What is the password?");
        guess = sc.nextLine();
       }

       System.out.println("Good Job!");
    }
}


