import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;  
import java.util.ArrayList;


public class mid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Integer[] caseNum = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        Integer[] money = {1,2,5,10,20,25,50,100,1000,2000,5000,10000,20000,25000,50000,75000,100000,12000,125000,150000,175000,200000,225000,250000,275000,300000}; // Possible money values

        List<Integer> roundList = new ArrayList<Integer>();
        boolean[] openedCases = new boolean[30];

        Integer sum = 0;
        Integer bankOffer = 0;
        Integer lastCase = 0;
        Integer lastVal = 0;
        Integer finalValue = 0;
        Integer finalChoice = 0;
        

       

        List<Integer> moneyList = new ArrayList<>(Arrays.asList(money));
        List<Integer> numList = new ArrayList<>(Arrays.asList(caseNum));


        Collections.shuffle(moneyList);

        System.out.println();
        System.out.println();
        System.out.println(moneyList);
        System.out.println();


        System.out.println("Pick a case number 1-26");
        int userCase = sc.nextInt();
        openedCases[userCase - 1] = true;
        numList.remove(userCase - 1);


        int userValue = moneyList.get(userCase - 1) ;
        moneyList.remove(userCase - 1);
        System.out.println("The case you have chosen is: " + userCase +" which has a value of: $"+ userValue);
      

        System.out.println();

        int k = 6;
        for(int i = 0; i<6;i++){
            
            System.out.println("The cases remaining are: " );
            //System.out.println("The vaules remaining are: "+ moneyList);

            for (int j = 0; j < 26; j++) {
                if (!openedCases[j]) {
                    System.out.print((j+1) + " ");
                }
            }
            
            System.out.println();
            System.out.println("Pick "+ k + " more cases");
            int choice = sc.nextInt()- 1;
            openedCases[choice] = true;
            int choiceVal = moneyList.get(choice );
            roundList.add(choiceVal);
            System.out.println("You have chosen Case: "+ (choice+1) + " With a value of: $"+ choiceVal);


            k = k-1;
        }   
        // creating the bank offer 
        for(int i = 0;i<roundList.size();i++){
            sum = sum + roundList.get(i);

        }
        bankOffer = sum / roundList.size();

        System.out.println("The Banktellers off is $" + bankOffer+ ". Deal or No Deal?");
        String cont = sc.nextLine();

        if (cont == "No Deal") {
            System.out.println("Lets continue!");
        } else{
            System.out.println("The banks offer was $" + bankOffer);
            System.out.println("The value of your orginal case:"+ userCase + " was: $"+ userValue);
            if (userValue > bankOffer){
                System.out.println("Congrats! You beat the bank!");

            } else {
                System.out.println("Sorry try again next time!");
            }
        }
        //round 2
        k = 5;
        for(int i = 0; i<6;i++){
            
            System.out.println("The cases remaining are: " );
            //System.out.println("The vaules remaining are: "+ moneyList);

            for (int j = 0; j < 26; j++) {
                if (!openedCases[j]) {
                    System.out.print((j+1) + " ");
                }
            }
            
            System.out.println();
            System.out.println("Pick "+ k + " more cases");
            int choice = sc.nextInt()- 1;
            openedCases[choice] = true;
            int choiceVal = moneyList.get(choice -1 );
            roundList.add(choiceVal);
            System.out.println("You have chosen Case: "+ (choice+1) + " With a value of: $"+ choiceVal);


            k = k-1;
        }   
        // creating the bank offer 
        for(int i = 0;i<roundList.size();i++){
            sum = sum + roundList.get(i);

        }
        bankOffer = sum / roundList.size();

        System.out.println("The Banktellers off is $" + bankOffer+ ". Deal or No Deal?");
        cont = sc.nextLine();

        if (cont == "No Deal") {
            System.out.println("Lets continue!");
        } else{
            System.out.println("The banks offer was $" + bankOffer);
            System.out.println("The value of your orginal case:"+ userCase + " was: $"+ userValue);
            if (userValue > bankOffer){
                System.out.println("Congrats! You beat the bank!");

            } else {
                System.out.println("Sorry try again next time!");
            }
        }

        //round 3
        k = 4;
        for(int i = 0; i<6;i++){
            
            System.out.println("The cases remaining are: " );
            //System.out.println("The vaules remaining are: "+ moneyList);

            for (int j = 0; j < 26; j++) {
                if (!openedCases[j]) {
                    System.out.print((j+1) + " ");
                }
            }
            
            System.out.println();
            System.out.println("Pick "+ k + " more cases");
            int choice = sc.nextInt()- 1;
            openedCases[choice] = true;
            int choiceVal = moneyList.get(choice -1 );
            roundList.add(choiceVal);
            System.out.println("You have chosen Case: "+ (choice+1) + " With a value of: $"+ choiceVal);


            k = k-1;
        }   
        // creating the bank offer 
        for(int i = 0;i<roundList.size();i++){
            sum = sum + roundList.get(i);

        }
        bankOffer = sum / roundList.size();

        System.out.println("The Banktellers off is $" + bankOffer+ ". Deal or No Deal?");
        cont = sc.nextLine();

        if (cont == "No Deal") {
            System.out.println("Lets continue!");
        } else{
            System.out.println("The banks offer was $" + bankOffer);
            System.out.println("The value of your orginal case:"+ userCase + " was: $"+ userValue);
            if (userValue > bankOffer){
                System.out.println("Congrats! You beat the bank!");

            } else {
                System.out.println("Sorry try again next time!");
            }
        }

        //round 4
        k = 3;
        for(int i = 0; i<6;i++){
            
            System.out.println("The cases remaining are: " );
            //System.out.println("The vaules remaining are: "+ moneyList);

            for (int j = 0; j < 26; j++) {
                if (!openedCases[j]) {
                    System.out.print((j+1) + " ");
                }
            }
            
            System.out.println();
            System.out.println("Pick "+ k + " more cases");
            int choice = sc.nextInt()- 1;
            openedCases[choice] = true;
            int choiceVal = moneyList.get(choice -1 );
            roundList.add(choiceVal);
            System.out.println("You have chosen Case: "+ (choice+1) + " With a value of: $"+ choiceVal);


            k = k-1;
        }   
        // creating the bank offer 
        for(int i = 0;i<roundList.size();i++){
            sum = sum + roundList.get(i);

        }
        bankOffer = sum / roundList.size();

        System.out.println("The Banktellers off is $" + bankOffer+ ". Deal or No Deal?");
        cont = sc.nextLine();

        if (cont == "No Deal") {
            System.out.println("Lets continue!");
        } else{
            System.out.println("The banks offer was $" + bankOffer);
            System.out.println("The value of your orginal case:"+ userCase + " was: $"+ userValue);
            if (userValue > bankOffer){
                System.out.println("Congrats! You beat the bank!");

            } else {
                System.out.println("Sorry try again next time!");
            }
        }

        //round 5
        k = 2;
        for(int i = 0; i<6;i++){
            
            System.out.println("The cases remaining are: " );
            //System.out.println("The vaules remaining are: "+ moneyList);

            for (int j = 0; j < 26; j++) {
                if (!openedCases[j]) {
                    System.out.print((j+1) + " ");
                }
            }
            
            System.out.println();
            System.out.println("Pick "+ k + " more cases");
            int choice = sc.nextInt()- 1;
            openedCases[choice] = true;
            int choiceVal = moneyList.get(choice -1 );
            roundList.add(choiceVal);
            System.out.println("You have chosen Case: "+ (choice+1) + " With a value of: $"+ choiceVal);


            k = k-1;
        }   
        // creating the bank offer 
        for(int i = 0;i<roundList.size();i++){
            sum = sum + roundList.get(i);

        }
        bankOffer = sum / roundList.size();

        System.out.println("The Banktellers off is $" + bankOffer+ ". Deal or No Deal?");
        cont = sc.nextLine();

        if (cont == "No Deal") {
            System.out.println("Lets continue!");
        } else{
            System.out.println("The banks offer was $" + bankOffer);
            System.out.println("The value of your orginal case:"+ userCase + " was: $"+ userValue);
            if (userValue > bankOffer){
                System.out.println("Congrats! You beat the bank!");

            } else {
                System.out.println("Sorry try again next time!");
            }
        }

        //round 6

        for(int i = 0; i<6;i++){
            
            System.out.println("The cases remaining are: " );
            //System.out.println("The vaules remaining are: "+ moneyList);

            for (int j = 0; j < 26; j++) {
                if (!openedCases[j]) {
                    System.out.print((j+1) + " ");
                }
            }
            
            System.out.println();
            System.out.println("Pick one more case");
            int choice = sc.nextInt()- 1;
            openedCases[choice] = true;
            int choiceVal = moneyList.get(choice -1 );
            roundList.add(choiceVal);
            System.out.println("You have chosen Case: "+ (choice+1) + " With a value of: $"+ choiceVal);



        }   
        // creating the bank offer 
        for(int i = 0;i<roundList.size();i++){
            sum = sum + roundList.get(i);

        }
        bankOffer = sum / roundList.size();

        System.out.println("The Banktellers off is $" + bankOffer+ ". Deal or No Deal?");
        cont = sc.nextLine();

        if (cont == "No Deal") {
            System.out.println("Lets continue!");
        } else{
            System.out.println("The banks offer was $" + bankOffer);
            System.out.println("The value of your orginal case:"+ userCase + " was: $"+ userValue);
            if (userValue > bankOffer){
                System.out.println("Congrats! You beat the bank!");

            } else {
                System.out.println("Sorry try again next time!");
            }
        }

        //round 7
        for(int i = 0; i<6;i++){
            
            System.out.println("The cases remaining are: " );
            //System.out.println("The vaules remaining are: "+ moneyList);

            for (int j = 0; j < 26; j++) {
                if (!openedCases[j]) {
                    System.out.print((j+1) + " ");
                }
            }
            
            System.out.println();
            System.out.println("Pick one more case");
            int choice = sc.nextInt()- 1;
            openedCases[choice] = true;
            int choiceVal = moneyList.get(choice -1 );
            roundList.add(choiceVal);
            System.out.println("You have chosen Case: "+ (choice+1) + " With a value of: $"+ choiceVal);



        }   
        // creating the bank offer 
        for(int i = 0;i<roundList.size();i++){
            sum = sum + roundList.get(i);

        }
        bankOffer = sum / roundList.size();

        System.out.println("The Banktellers off is $" + bankOffer+ ". Deal or No Deal?");
        cont = sc.nextLine();

        if (cont == "No Deal") {
            System.out.println("Lets continue!");
        } else{
            System.out.println("The banks offer was $" + bankOffer);
            System.out.println("The value of your orginal case:"+ userCase + " was: $"+ userValue);
            if (userValue > bankOffer){
                System.out.println("Congrats! You beat the bank!");

            } else {
                System.out.println("Sorry try again next time!");
            }
        }


        //round 8
        for(int i = 0; i<6;i++){
            
            System.out.println("The cases remaining are: " );
            //System.out.println("The vaules remaining are: "+ moneyList);

            for (int j = 0; j < 26; j++) {
                if (!openedCases[j]) {
                    System.out.print((j+1) + " ");
                }
            }
            
            System.out.println();
            System.out.println("Pick one more case");
            int choice = sc.nextInt()- 1;
            openedCases[choice] = true;
            int choiceVal = moneyList.get(choice -1 );
            roundList.add(choiceVal);
            System.out.println("You have chosen Case: "+ (choice+1) + " With a value of: $"+ choiceVal);



        }   
        // creating the bank offer 
        for(int i = 0;i<roundList.size();i++){
            sum = sum + roundList.get(i);

        }
        bankOffer = sum / roundList.size();

        System.out.println("The Banktellers off is $" + bankOffer+ ". Deal or No Deal?");
        cont = sc.nextLine();

        if (cont == "No Deal") {
            System.out.println("Lets continue!");
        } else{
            System.out.println("The banks offer was $" + bankOffer);
            System.out.println("The value of your orginal case:"+ userCase + " was: $"+ userValue);
            if (userValue > bankOffer){
                System.out.println("Congrats! You beat the bank!");

            } else {
                System.out.println("Sorry try again next time!");
            }
        }


        //round 9
        for(int i = 0; i<6;i++){
            
            System.out.println("The cases remaining are: " );
            //System.out.println("The vaules remaining are: "+ moneyList);

            for (int j = 0; j < 26; j++) {
                if (!openedCases[j]) {
                    System.out.print((j+1) + " ");
                }
            }
            
            System.out.println();
            System.out.println("Pick one more case");
            int choice = sc.nextInt()- 1;
            openedCases[choice] = true;
            int choiceVal = moneyList.get(choice -1 );
            roundList.add(choiceVal);
            System.out.println("You have chosen Case: "+ (choice+1) + " With a value of: $"+ choiceVal);



        }   
        // creating the bank offer 
        for(int i = 0;i<roundList.size();i++){
            sum = sum + roundList.get(i);

        }
        bankOffer = sum / roundList.size();

        System.out.println("The Banktellers off is $" + bankOffer+ ". Deal or No Deal?");
        cont = sc.nextLine();

        if (cont == "No Deal") {
            System.out.println("Lets continue!");
        } else{
            System.out.println("The banks offer was $" + bankOffer);
            System.out.println("The value of your orginal case:"+ userCase + " was: $"+ userValue);
            if (userValue > bankOffer){
                System.out.println("Congrats! You beat the bank!");

            } else {
                System.out.println("Sorry try again next time!");
            }
        }


        //round 10
        for(int i = 0; i<6;i++){
            
            System.out.println("The cases remaining are: " );
            //System.out.println("The vaules remaining are: "+ moneyList);

            for (int j = 0; j < 26; j++) {
                if (!openedCases[j]) {
                    System.out.print((j+1) + " ");
                }
            }
            
            System.out.println();
            System.out.println("Pick one more case");
            int choice = sc.nextInt()- 1;
            openedCases[choice] = true;
            int choiceVal = moneyList.get(choice -1 );
            roundList.add(choiceVal);
            System.out.println("You have chosen Case: "+ (choice+1) + " With a value of: $"+ choiceVal);



        }   
        // creating the bank offer 
        for(int i = 0;i<roundList.size();i++){
            sum = sum + roundList.get(i);

        }
        bankOffer = sum / roundList.size();

        System.out.println("The Banktellers off is $" + bankOffer+ ". Deal or No Deal?");
        cont = sc.nextLine();

        if (cont == "No Deal") {
            System.out.println("Lets continue!");
        } else{
            System.out.println("The banks offer was $" + bankOffer);
            System.out.println("The value of your orginal case:"+ userCase + " was: $"+ userValue);
            if (userValue > bankOffer){
                System.out.println("Congrats! You beat the bank!");

            } else {
                System.out.println("Sorry try again next time!");
            }
        }


        //round 11 one case left last round 
        for(int i = 0; i<6;i++){
            
            System.out.println("The final case remaining is: " );
            //System.out.println("The vaules remaining are: "+ moneyList);

            for (int j = 0; j < 26; j++) {
                if (!openedCases[j]) {
                    System.out.print((j+1) + " ");
                    lastCase = j+1;
                }
            }
            lastVal = moneyList.get(lastCase - 1);

            System.out.println();
            System.out.println("Which number case you like to chose? Your orginal case:"+ userCase+ " or chose the final case?");
            System.out.println("Case :");
            finalChoice = sc.nextInt();

            if (finalChoice == userCase){
                finalValue =  userValue;
            } else {
                finalValue = lastVal;
            } 
        


        }   
        

        System.out.println("The value of your orginal case:"+ userCase + " was: $"+ userValue);
        if (userValue > finalValue){
            System.out.println("Congrats! You beat the game!");

        } else {
            System.out.println("Sorry try again next time!");
        }
        

    }       

} 