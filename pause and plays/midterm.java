import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;  
import java.util.ArrayList;


public class midterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //case and value arrays 
        Integer[] caseNum = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        Integer[] values = {1,2,5,10,20,25,50,100,1000,2000,5000,10000,20000,25000,50000,75000,100000,12000,125000,150000,175000,200000,225000,250000,275000,300000};
        // shuffling the values list so each the case values are in order; turing it into a list and then shu
        List<Integer> valuesList = new ArrayList<>(Arrays.asList(values));
        List<Integer> caseList = new ArrayList<>(Arrays.asList(caseNum));

        for (int i = 0;i <values.length;i++){
            Collections.shuffle(valuesList);

        }



        System.out.println(values.length);
        System.out.println(caseNum.length);
        System.out.println(caseList);
        System.out.println(valuesList);
        //users beginning case
        System.out.println("Pick a case number 1-26");
        int userCase = sc.nextInt();
        int userVal= valuesList(userCase -1);
        //caseList.remove(userCase - 1);
        //valuesList.remove(userCase +1);

        System.out.println(userVal);
        System.out.println(userCase);
        System.out.println();
        System.out.println();
        System.out.println(caseList);
        System.out.println(valuesList);

     
        System.out.println("Pick one of the following cases ");
        System.out.println(caseList);

    }
} 