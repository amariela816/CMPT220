//always start with importing our scanner so we can use it!
import java.util.Scanner;

public class ifelsepause {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 2;
        if (num >= 1) {
            System.out.println("Yes, "+ num+ " is greater than 1");
        } else  {
            System.out.println("No, "+ num + " is less than 1");
        }

        String name = "Athina";
        if (name == "athina"){
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }

        int num1 = 8;
        int num2 = 16;
        if (num1 == num2){
            System.out.println(num1 + " and " + num2 + " are equal");
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than "+ num2);
        } else {
            System.out.println(num2 + " is greater than "+ num1);
        }

        int four = 4;
        if (four > 5){
            System.out.println("Too big");
        } else if (four > 0 && four< 5) {
            System.out.println("Just right");
        } else {
            System.out.println("Too small!");
        }

        System.out.println("What is your age?");
        Integer age = sc.nextInt();
        if (age >= 21){
            System.out.println("You can legally drink");
        } else {
            int years = (21 - age);
            System.out.println("You are still to young, it is illegal for you to drink! You must wait " + years + " more years to drink.");

        }

        System.out.println("What is your age?");
        Integer age1 = sc.nextInt();
        int yearsLeft1 = (25 - age1);
        int yearsLeft2 = (21 - age1);
        int yearsLeft3 = (18 - age1);
        if (age1 >= 25){
            System.out.println("You can smoke, drink, and rent a car!");
        } else if (age1 >= 21 && age1 <= 25) {
            System.out.println("You can smoke and drink but you have to wait " +yearsLeft1+ " years to rent a car!");
        } else if (age1 >= 18 && age1 <= 21) {
            System.out.println("You can smoke, but you have to wait "+ yearsLeft2 + " years to drink and " + yearsLeft1 + " years to rent a car!");
       } else {
            System.out.println("Sorry kid you can only have sody pops! In " +yearsLeft3+ " years you can smoke, in "+yearsLeft2+" years you can drink and in "+yearsLeft1+" years you can rent a car!");
        }
    }
}
