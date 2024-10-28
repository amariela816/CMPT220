import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intarray = {1,2,3,4,5};
        System.out.println(intarray[4]);
        intarray[4] = 6;
        System.out.println(intarray[4]);
        String [] strarray = {"Athina","Cece","Valeria","Erin"};

        // creating an empty array 
        int[] newArray;
        // adding varible to the array 
        newArray = new int[]{0,1,2,3,};

        int myArray[]= new int[4];
        System.out.println(myArray[1]);
    }
} 



/*
Referencing your homework from https://github.com/melissachodziutko/CMPT220/blob/main/Homework%203/LoopsDebug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/






    public static int probTwo(int total){

        for (int i = 1; i < x; i++){
            total = total * 1;
        }
        return(total);
    }


    public static probThree () {
        
    }
  