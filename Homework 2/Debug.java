import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //for this section: are these all printing the best option? If they aren't, fix it!
        //(However you interpret 'fix' is fine i promise, any way you fix it shows you get the concept to me)
        int var1 = 4;
        if (var1 > 4){
            System.out.println("Var1 is greater than 4");
        } else if (var1 == 4){
            System.out.println("Var1 is 4");
        }else{
            System.out.println("Var1 is less than 4");
        }

        int var2 = 6;
        if (var2 == 5){
            System.out.println("Var2 is 5");
        } else if (var2 > 5){
            System.out.println("Var2 is greater than 5");
        } else if (var2 < 6){
            System.out.println("Var2 is less than 5");
        } else{
            System.out.println("Var2 is 6");
        }

        int var3 = 5;
        if (var3 > 10){
            System.out.println("Var3 is greater than 10");
        } else {
            System.out.println("Var3 is less than 10");
        }




        //for this section: why are we not entering the if statement?
        System.out.println("What is the name of your school?");
        String school = sc.nextLine();
        if (school.equals("marist") ){
            System.out.println("Marist college!");
        } else{
            System.out.println("Not marist college :(!");
        }


    }
}