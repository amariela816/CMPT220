
 import java.util.Scanner;

 public class reverse {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("What is your name?");
         String name = sc.nextLine();
         for(int i = 0; i < name.length(); i--){
             System.out.println(name.charAt(i));
         }
     }
 }
 