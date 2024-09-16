//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class ifelsepractice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    

    int score = 0;


    System.out.println("Welcome to the Spongebob Trivia Quiz, enter your name to begin");
    String name = sc.nextLine();


    System.out.println("Welcome "+ name + "lets begin!");

    //Q1
    System.out.println("Question 1: What is the name of Spongebobs snail? ");
    System.out.println("a) Spike b) Gary c) Fluffy d) Bob");

    System.out.println("Answer: ");
    String q1 = sc.nextLine();
    
    if (q1.equals ("b" )){
        System.out.println("Correct");
        score = score +1;
    }   else {
        System.out.println("Incorrect!");
    }
   
    System.out.println("Your score is: "+ score);
    System.out.println("");

    //Q2
    System.out.println("Question 2: What was the name of the first spongebob episode? ");
    System.out.println("a) The Algae’s Always Greener b) The Secret Box c) Help Wanted d)Ripped Pants");
    
    System.out.println("Answer: ");
    String q2 = sc.nextLine();
    
    if (q2.equals ("c" )){
        System.out.println("Correct");
        score = score +1;
        }   else {
        System.out.println("Incorrect!");
    }

    System.out.println("Your score is: "+ score);
    System.out.println("");

    //Q3
    System.out.println("Question 3: Whos is Mr. Krabs' enemy?");
    System.out.println("a) Squidward b) Plankton c) Mermaid Man d) Larry the Lobster");
    
    System.out.println("Answer: ");
    String q3 = sc.nextLine();

    if (q3.equals ("b" )){
        System.out.println("Correct");
        score = score +1;
        }   else {
        System.out.println("Incorrect!");
    }
    System.out.println("Your score is: "+ score);
    System.out.println("");

//Q4
    System.out.println("Question 4: What kind of animal is Sandy Cheeks?");
    System.out.println("a) Squirrel b) Cat c) Fish d) Octopus");
    
    System.out.println("Answer: ");
    String q4 = sc.nextLine();
    
    if (q4.equals ("a" )){
        System.out.println("Correct");
        score = score +1;
        }   else {
        System.out.println("Incorrect!");
    }
    System.out.println("Your score is: "+ score);
    System.out.println("");

    //Q5
    System.out.println("Question 5: What state is Sany Cheeks from?");
    System.out.println("a) Florida b) California c) Texas d) Louisiana");
    
    System.out.println("Answer: ");
    String q5 = sc.nextLine();

    if (q5.equals( "c" )){
        System.out.println("Correct");
        score = score +1;
        }   else {
        System.out.println("Incorrect!");
    }
    System.out.println("Your score is: "+ score);
    System.out.println("");

    //if score = 3 and contine 
    if (score >= 3){
        System.out.println("You have gotten the minimum of three correcrt! Would you like to contine?");
        String cont = sc.nextLine();

        if (cont.equals("yes")){
            
//Q6
    System.out.println("Question 6: What kind of animal is Squidward?");
    System.out.println("a) Squid b) Octopus c) Jellyfish d) Crab");
    
    System.out.println("Answer: ");
    String q6 = sc.nextLine();

    if (q6.equals ("b" )){
        System.out.println("Correct");
        score = score +1;
        }   else {
        System.out.println("Incorrect!");
    }
    System.out.println("Your score is: "+ score);
    System.out.println("");

    //Q7
    System.out.println("Question 7: Im ___  ");
    System.out.println("a) Happy b) Sad c) Ready d) Tired");
    
    System.out.println("Answer: ");
    String q7 = sc.nextLine();

    if (q7.equals ("c")){
        System.out.println("Correct");
        score = score +1;
        }   else {
        System.out.println("Incorrect!");
    }
    System.out.println("Your score is: "+ score);
    System.out.println("");

    //Q8
    System.out.println("Question 8: What did Plankton steal from King Neptune?");
    System.out.println("a) His trident b) His crown c) His treasure chest d) His scepter");
    
    System.out.println("Answer: ");
    String q8 = sc.nextLine();

    if (q8.equals ("b" )){
        System.out.println("Correct");
        score = score +1;
        }   else {
        System.out.println("Incorrect!");
    }
    System.out.println("Your score is: "+ score);
    System.out.println("");
    
    //Q9
    System.out.println("Question 9: Where did SPongebob and Patrick have to go to get back King Neptunes crown? ");
    System.out.println("a) Jellyfish Fields b) Bikini Bottom c) Shell City d) The Goo Lagoon");
    
    System.out.println("Answer: ");
    String q9 = sc.nextLine();

    if (q7.equals ("c" )){
        System.out.println("Correct");
        score = score +1;
        }   else {
        System.out.println("Incorrect!");
    }
    System.out.println("Your score is: "+ score);
    System.out.println("");

    //Q10
    System.out.println("Question 10: Is ___ an instrustment? - mayonnaise");
    System.out.println("a) A trumpet b) A guitar c) Mayonnaise d) A drum");
    
    System.out.println("Answer: ");
    String q10 = sc.nextLine();

    if (q10.equals ("c" )){
        System.out.println("Correct");
        score = score +1;
        }   else {
        System.out.println("Incorrect!");
    }

    System.out.println("Your score is: "+ score);
    System.out.println("");




        } else{
            System.out.println("Have a great day!");
        }





        } else { }


    


    






}
}


