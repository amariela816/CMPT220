//always start with importing our scanner so we can use it!
import java.util.Scanner;

public class passplay {
    public static void main(String[] args) {
        //I've already set up a scanner with the name 'sc' for you!
        Scanner sc = new Scanner(System.in);
        
       //int d = 1;
        //while (d >0 ){
        //   System.out.println(d);
        //   d++;
        //} 
       
       System.out.println("What is the password?");
       String guess = sc.nextLine();
       String pass = "Athina123";
       
       while (!guess.equals(pass)){
        System.out.println("Try again");
        guess = sc.nextLine();
       }

       System.out.println("Correct, Good Job!");



       Integer total = 0;
       System.out.println("Enter a number ");
       Integer num = sc.nextInt();
       Integer sum = 0;
       while (num >= 0){
        sum = sum + num;
        System.out.println("Enter another number");
        num = sc.nextInt();
       }
       sum = sum + num;
       System.out.println("The total sum of your numbers was: "+ sum);


    }

}


