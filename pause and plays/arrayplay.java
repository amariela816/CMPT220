import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


public class arrayplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] names = {"Athina","Cece","Valeria","Erin"};

        int [] ages = {19,20,21,22,23};

        String [] array = new String[8];

        int[] newArray;

        String [] favFoods = new String[3];
        favFoods = new String[] {"Mac and Cheese", "Pizza", "Guac"};
        System.out.println(favFoods[0]);
        System.out.println();
        
        int j = 1;
        for(int i = 0;i < favFoods.length;i++){
            System.out.println("Food " + j +": "+ favFoods[i]);
            j++;
        }
        System.out.println();

        for(int i = 0;i < names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println();

        for(int i = 0;i < ages.length;i++){
            System.out.println(ages[i]);
        }
        System.out.println();


        Integer [] random =  {12,32,43,54,75,22,4,8,20,33};
        Arrays.sort(random);
        Arrays.sort(random, Collections.reverseOrder());
        System.out.println(Arrays.toString(random));

      //  for(int i = 0;i < random.length;i++){
        //    System.out.println(random[i]);

        //}
    //System.out.println();
        

        Integer [] pause = {3,8,10,6,2};
        Arrays.sort(pause);
        System.out.println(pause[0]);

    }
} 