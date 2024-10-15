import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;  
import java.util.ArrayList;


public class tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Integer[] caseNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        Integer[] money = {1, 2, 5, 10, 20, 25, 50, 100, 1000, 2000, 5000, 10000, 20000, 25000, 50000, 75000, 100000, 12000, 125000, 150000, 175000, 200000, 225000, 250000, 275000, 300000};

        List<Integer> roundList = new ArrayList<>();
        boolean[] openedCases = new boolean[26];

        Integer sum = 0;
        Integer bankOffer = 0;
        Integer lastCase = 0;
        Integer lastVal = 0;
        Integer finalValue;
        Integer finalChoice;

        List<Integer> moneyList = new ArrayList<>(Arrays.asList(money));
        List<Integer> numList = new ArrayList<>(Arrays.asList(caseNum));

        Collections.shuffle(moneyList);  // Randomizing money in cases
        System.out.println(moneyList);
        System.out.println("Pick a case number 1-26");
        int userCase = sc.nextInt();
        openedCases[userCase - 1] = true;

        int userValue = moneyList.get(userCase - 1);
        moneyList.set(userCase - 1, null);  // Marking the user's case in the list

        System.out.println("The case you have chosen is: " + userCase + " which has a value of: $" + userValue);

        // Game rounds
        int roundCount = 1;
        int casesToOpen = 6;  // Number of cases to open per round

        while (casesToOpen > 0) {
            System.out.println("\nRound " + roundCount + ":");
            System.out.println("The cases remaining are: ");
            
            // Display available cases
            for (int j = 0; j < 26; j++) {
                if (!openedCases[j]) {
                    System.out.print((j + 1) + " ");
                }
            }

            System.out.println("\nPick " + casesToOpen + " more cases.");
            for (int i = 0; i < casesToOpen; i++) {
                int choice = sc.nextInt() - 1;
                openedCases[choice] = true;
                int choiceVal = moneyList.get(choice);
                roundList.add(choiceVal);
                System.out.println("You have chosen Case: " + (choice + 1) + " With a value of: $" + choiceVal);
                System.out.println();
                System.out.println("The cases remaining are: ");
            
            // Display available cases
            for (int j = 0; j < 26; j++) {
                if (!openedCases[j]) {
                    System.out.print((j + 1) + " ");
                }
            }
            System.out.println();

            }

            // Calculate the bank offer
            sum = 0;
            for (int value : roundList) {
                sum += value;
            }
            bankOffer = sum / roundList.size();

            sc.nextLine();  // Consume newline after integer input
            System.out.println("The Bank's offer is $" + bankOffer + ". Deal or No Deal?");
            String cont = sc.nextLine();

            if (cont.equalsIgnoreCase("No Deal")) {
                System.out.println("Let's continue!");
                casesToOpen--;  // Decrease the number of cases to open in the next round
            } else {
                System.out.println("The bank's offer was $" + bankOffer);
                System.out.println("The value of your original case: " + userCase + " was: $" + userValue);
                if (userValue > bankOffer) {
                    System.out.println("Congrats! You beat the bank!");
                } else {
                    System.out.println("Sorry, try again next time!");
                }
                return;  // End the game if the user takes the deal
            }
            roundCount++;
        }

        // Final case selection
        for (int j = 0; j < 26; j++) {
            if (!openedCases[j]) {
                lastCase = j + 1;
                lastVal = moneyList.get(lastCase - 1);
            }
        }

        System.out.println("\nThe final case remaining is case #" + lastCase);
        System.out.println("Do you want to stick with your original case (" + userCase + ") or switch to case #" + lastCase + "?");
        finalChoice = sc.nextInt();

        if (finalChoice == userCase) {
            finalValue = userValue;
        } else {
            finalValue = lastVal;
        }

        System.out.println("The value of your original case was: $" + userValue);
        System.out.println("The value of the final chosen case was: $" + finalValue);

        if (finalValue > bankOffer) {
            System.out.println("Congrats! You beat the game!");
        } else {
            System.out.println("Sorry, try again next time!");
        }
    }
} 