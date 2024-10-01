import java.util.Scanner;

public class loopsplay2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++){
            sum = sum + i;
        }
        System.out.println(sum);


        int ten = 10; 
        for(int i = 10; i > 0 ;i--){
            System.out.println(i);
            
        }
        

        String password = "Athina123";
        System.out.println("Enter the password");
        String userPass = sc.nextLine();

       
       while(userPass != password){

        if (password.equals(userPass)){
        System.out.println("Correct");
        } else {
        System.out.println("Incorrect, try again");
        userPass = sc.nextLine();
        }
    }
    }
}