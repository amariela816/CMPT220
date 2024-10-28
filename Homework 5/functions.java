/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/
import java.util.Scanner;
import java.util.Collections;

public class functions {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.err.println("What was the total of your purchase?");
        Double total = sc.nextDouble();
        System.out.println("Are you a member of our website?");
        sc.nextLine();
        String member = sc.nextLine();


        if (member.equalsIgnoreCase("No")){
            System.out.println("Today costumers recieve a 5% discount, your new total is " + regular(total));   
        } else {
            System.out.println("Are you a VIP member?");
            String vip = sc.nextLine();
            if (vip.equalsIgnoreCase("Yes")){
                System.out.println("Today VIP members recieve a 15% discount, your new total is " + vip(total));
            } else {
                System.out.println("Today members recieve a 10% discount, your total new is " + member(total));
            }
        } 
       
    }
   

    public static double regular(Double x) {
        Double dis = x * 0.05;
        return(x - dis);
    }

    public static double member(Double x) {
        Double dis = x * 0.1;
        return(x - dis);
    }

    public static double vip(Double x) {
        Double dis = x * 0.15;
        return(x - dis);
    }
}
