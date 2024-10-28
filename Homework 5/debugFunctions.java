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

import java.util.Scanner;
public class debugFunctions {
    

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter your first number to be added");
    int firstInput = sc.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = sc.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();

    System.out.println("Enter a number and I will tell you the fatorial: ");
    Integer x = sc.nextInt();
    System.out.println(probTwo(x));
    
    System.out.println("Enter a number and I will tell you the sum of every other number: ");
    Integer num = sc.nextInt();
    System.out.println(probThree(num));

    System.out.println("Enter a word and ill give you the reverse!");
    sc.nextLine();
    String input = sc.nextLine();
    
    probFive(input);


}

  
    public static int add(int zyx, int tuv){


        return(zyx + tuv);


    }

  
    public static void printDog(){
        System.out.println("Dog");
    }

    

    public static int probTwo(Integer total) {
        Integer num = total; 
        for(int i =1; i< num ;i++){
            total = total * i;

        }
        return(total);
    }

    public static int probThree(Integer x) {
        Integer end = 0;
        for(int sum = 1; sum<= x;sum+=2){
            end = end + sum;
        }
        return(end);
    }
 
    
    public static void probFive(String x) {
        String reverse = "";
        char ch;
        for (int i=0; i< x.length();i++){
            ch = x.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println(reverse);
    }
}