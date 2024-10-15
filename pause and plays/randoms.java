import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;  
import java.util.ArrayList;


public class randoms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); 

        Integer[] caseNum = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        Integer[] cases = new Integer[26]; // Array to store the amounts in each briefcase
        Integer[] money = {1,2,5,10,20,25,50,100,1000,2000,5000,10000,20000,25000,50000,75000,100000,12000,125000,150000,175000,200000,225000,250000,275000,300000}; // Possible money values
         

        // Shuffle moneyValues and assign to briefcases
        //for (int i = 0; i < cases.length; i++) {
           // int ran = money[random.nextInt(money.length)];
            //cases[i] = ran;
           // }
        
        List<Integer> casesList = new ArrayList<>(Arrays.asList(cases));
        List<Integer> moneyList = new ArrayList<>(Arrays.asList(money));
        List<Integer> numList = new ArrayList<>(Arrays.asList(caseNum));
        //System.out.println(casesList.size());


        for (int i = 0; i<casesList.size();i++){
            casesList.add(i, moneyList.get(random.nextInt(moneyList.size())));

        }
        System.out.println(casesList);
       
     
        
    }
} 