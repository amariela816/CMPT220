import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class midtermProj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // setting the arrays and lists
        Integer[] money = {1, 2, 5, 10, 20, 25, 50, 100, 1000, 2000, 5000, 10000, 20000, 25000, 50000, 75000, 100000, 12000, 125000, 150000, 175000, 200000, 225000, 250000, 275000, 300000};
        List<Integer> roundList = new ArrayList<>();
        boolean[] openedCases = new boolean[26];
        List<Integer> moneyList = new ArrayList<>(Arrays.asList(money));
        //shuffling the money so that the cases have a random value
        Collections.shuffle(moneyList);

        //setting integers that will be used later in the code
        Integer sum = 0;
        Integer bankOffer = 0;
        Integer lastCase = 0;
        Integer lastVal = 0;
        Integer finalValue;
        Integer finalChoice;


        // setting the users case choice and the value of it
        System.out.println("Pick a case number 1-26");
        Integer userCase = sc.nextInt();
        openedCases[userCase - 1] = true;

        Integer userValue = moneyList.get(userCase - 1);
        moneyList.set(userCase - 1, null);

        System.out.println("The case you have chosen is: " + userCase + ". Lets Begin!");



        //starting the rounds 
        Integer roundNum = 1;
        Integer casesToOpen = 4;

        //the loop for each round until the user takes the deal or only has one case left
        while (true){
            System.out.println();
            System.out.println("Round: "+ roundNum);
            System.err.println("The remaining cases are: ");

            //prints out the cases are still unopened (the indexs that are "false")
            for (int i = 0; i <26; i++){
                if (!openedCases[i]) {
                    System.out.print((i + 1) + " ");                    
                }
            }
            System.out.println();

            //if cases to open = 4 then the loop will continue 
            int casesLeft = 26 - roundNum * 4;
            if (casesLeft <= 1) { 
                casesToOpen = 1; 
            } else {
                casesToOpen = 4; 
            }

            //the users case input and value throughout the round
            System.out.println("Pick "+ casesToOpen + " more cases");
            for(int i = 0; i <casesToOpen; i++){
                int newCase = sc.nextInt() - 1;
                // sets the case index in openedcases to true so that it wont show next time cases are shown 
                openedCases[newCase] = true; 
                int caseVal = moneyList.get(newCase);
                roundList.add(caseVal);
                System.out.println("Case: "+ (newCase + 1) + " Value: "+ caseVal);
            }


            // taking the average of the cases for the bank offer
            for(int i = 0; i< roundList.size();i++){
                int values = roundList.get(i);
                sum = sum + values;
            }
            bankOffer = sum / roundList.size();

            System.out.println();
            sc.nextLine();
            System.out.println("The Banks Offer is $"+ bankOffer);
            System.out.println("Deal or No Deal?");
            String cont = sc.nextLine();

            //to check if the user wants to take the deal or not
            if(cont.equalsIgnoreCase("No Deal")){
                System.out.println("Lets continue");
            } else{
                System.out.println("The value of your orginal case: " + userCase+ " was: $"+ userValue);
            
                if (bankOffer > userValue){
                    System.out.println("Congrats, you won!");
                } else {
                    System.out.println("Sorry, you lost :(");
                }
                return;
            }
            
            //checks to see if we go to the next round
            roundNum++;
            if(casesLeft <= 2 ){
                break;
            }

        }


        //when there is one case left, this will set the value of the case and money
        for (int i = 0; i < 26; i++){
            if(!openedCases[i]){
                lastCase = i+1;
                lastVal = moneyList.get(lastCase - 1);
            }
        }


        System.out.println("The final case is: Case "+ lastCase);
        System.out.println("Would you like to stay with your orginal Case: " + userCase+ " or choose the final case?");
        finalChoice = sc.nextInt();


        if (finalChoice == userCase) {
            finalValue = userValue;
        } else {
            finalValue = lastVal;
        }
    
        System.out.println("The value of your original case: " +userCase+  "was: $" + userValue);
        System.out.println("The value of the final case: "+finalChoice+" was: $" + lastVal);
        // compares the cases
        if (finalValue > lastVal) {
            System.out.println("Congrats! You beat the game!");
        } else {
            System.out.println("Sorry, try again next time!");
        }
    
    }
} 