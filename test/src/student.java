/*
for this problem you need to:
1. create 5 different students in your main
2. create a method in this file that returns if they're an honor roll student or not (gpa > 3.6) then
check each of the students in main
3. create a method to see if they get "free lunch" (this is a weird school, every day they generate a random student id
and see if any students match that id, if they do they get free lunch that day, yay!) compare a randomly generated id and the
id of the student to print the appropriate response.
 */

import java.util.Random;

public class student{
    String name;
    String year;
    double gpa;
    int id;
    public student(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;
    }
    
    //new method
    String honorRoll(){
        if(this.gpa> 3.6){
            return(this.name + " made Honor Roll!");
        } else {
            return(this.name + " did not make Honor Roll");
        }

    }

    
    //new method

    public void freeLunch() {
        Random rand = new Random();
        int randomId = rand.nextInt(3000); 
        
        System.out.println("The ID chosen for free lunch today is: "+ randomId);
        System.out.println(this.name + "'s ID is: "+ this.id);
        if (randomId == this.id) {
            System.out.println(this.name + " gets free lunch today!");
        } else {
            System.out.println(this.name + " does not get free lunch today.");
        }
    }
}
