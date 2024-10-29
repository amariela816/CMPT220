//always start with importing our scanner so we can use it!
import java.util.Scanner;

public class shorthand {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] friends = {"Emi","Cece","Valeria","Erin"};
        for(String i : friends){
            System.out.println(i);
        }

        for(int i = 0; i < friends.length;i++){
            System.out.println(friends[i]);
        }

        int[] nums = {1,2,3,4,5};
        for(int o: nums){
            System.out.println(o);
        }

        System.out.println("Enter your grade ");
        int grade = sc.nextInt();
        switch(grade){
            case 0:
                System.out.println("F");
                break;
            case 10:
                System.out.println("F");
                break;
            case 20:
                System.out.println("F");
                break;
            case 30:
                System.out.println("F");
                break;
            case 40:
                System.out.println("F");
                break;
            case 50:
                System.out.println("F");
                break;
            case 60:
                System.out.println("D");
                break;
            case 70:
                System.out.println("C");
                break;
            case 80:
                System.out.println("B");
                break;
            case 90:
                System.out.println("A");
                break;
            case 100:
                System.out.println("A");
                break;
        }


        System.out.println("Enter your age ");
        int age = sc.nextInt();
        switch(age){
            case 0:
            case 10:
                System.out.println("You can not drink");
                break;
            case 20:
                System.out.println("You may be able to drink");
                break;
            case 30:
            case 40:
            case 50:
            case 60:
            case 70:
            case 80:
            case 90:
                System.out.println("You can drink");
                break;
            default:
                System.out.println("Invalid Input");
        }
        int var = 100;
        var += 25;
        System.out.println(var);

        System.out.println(var -= 10);
        System.out.println(var *= 2);
        System.out.println(var /= 4);


        int var2 = 25;
        String result = (var2 > 4)?("Greater than 4") : ("Not greater than 4");
        System.out.println(result);

        System.out.println("Enter your age");
        int userAge = sc.nextInt();
        String drink = (userAge >= 21)?("can drink") : ("cannot drink");
        System.out.println(drink);

        



    }
}


