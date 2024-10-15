import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;  
import java.util.ArrayList;


public class deal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Random random = new Random(); 

        Integer[] caseNum = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        Integer[] money = {1,2,5,10,20,25,50,100,1000,2000,5000,10000,20000,25000,50000,75000,100000,12000,125000,150000,175000,200000,225000,250000,275000,300000}; // Possible money values
        //Integer[] roundValues= new Integer[26];
        List<Integer> roundList = new ArrayList<Integer>();
        boolean[] openedCases = new boolean[26];


       

        List<Integer> moneyList = new ArrayList<>(Arrays.asList(money));
        List<Integer> numList = new ArrayList<>(Arrays.asList(caseNum));


        Collections.shuffle(moneyList);

        System.out.println();
        System.out.println();
        System.out.println(moneyList);
        System.out.println();


        System.out.println("Pick a case number 1-26");
        int userCase = sc.nextInt();
        //System.out.println(userCase);
        numList.remove(userCase - 1);
        //System.out.println(numList);

        int userValue = moneyList.get(userCase - 1) ;
        //System.out.println(userValue);
        moneyList.remove(userCase - 1);
        //System.out.println(moneyList);
        System.out.println("The case you have chosen is: " + userCase +" which has a value of: $"+ userValue);
      

        System.out.println();
        //System.out.println(numList.size());
        int k = 6;
        for (int i = 0;i< 6;i++){

          System.out.println(j);
          System.out.println("The cases remaining are: " + numList);
          System.out.println("The vaules remaining are: "+ moneyList);

          
          System.out.println("Pick "+ k + " more cases");
          int choice = sc.nextInt();
          System.out.println(choice - j);
          numList.remove(choice - j);
          int choiceVal = moneyList.get(choice - j);
          moneyList.remove(choice -j);
          System.out.println();
          System.out.println("You have chosen Case: "+ choice + " With a value of: $"+ choiceVal);
          System.out.println();
          roundList.add(choiceVal);
          k = k-1 ;
          
        }
        System.out.println(roundList);

       // for (int i = 6; i < 0; i--){
         //   System.out.println("Pick " +i + " more cases");
           // choice = sc.nextInt();
            //System.out.println("The cases remaining are: " + numList);
          //  System.out.println("The vaules remaining are: "+ moneyList);
            
            
          //  roundList.add(choiceVal);
        //}

        //System.out.println(roundList);
        


        

     
        
    }
} 