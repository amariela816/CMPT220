//always start with importing our scanner so we can use it!
import java.util.Scanner;

public class loopspause {
    public static void main(String[] args) {
        //I've already set up a scanner with the name 'sc' for you!
        Scanner sc = new Scanner(System.in);

        String name = "Athiná";
        for (int a = 0; a <=20; a++){
            System.out.println(name);
         }
         
         int b = 0;
        while (b < 11){
           System.out.println(b);
            b++;
        }

        String P = "Athiná";
        int z = 0;
        while (z < 4){
            System.out.println(P);
            z++;
        }

        //infinite loop
        //int d = 1;
        //while (d >0 ){
        //   System.out.println(d);
        //   d++;
        //} 


        System.out.println("Enter a number");
        Integer num = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= num){
            sum = sum + i;
            i++;
            
        }
        System.out.println("The total sum is "+sum);


        int hours = 0;
        int mins = 0;

        for(int a = 0; a < 24; a++){

            for (int j = 0; j < 59; j++){
                mins++;
                System.out.println(hours + ":" + mins);
            }
            hours++;
            mins = 00;
        }


        for (int c = 1; c <= 5; c++)
        {
            for (int y = 1; y <= c; y++)
        {
            System.out.print(y + " ");
        }
            System.out.println();
    }

    int down = 10;
        while(down >= 0){
            System.out.println(down);
            down--;
        }
        
    System.out.println();

        for (int d = 10; d >= 0; d--){
            System.out.println(d);
         }
    }
}


