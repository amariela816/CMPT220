import java.util.Scanner;



public class fcnplay  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printName();
        callParam("Mariela");
        callParam("Vargas");
        callParam("Nineteen");
        exclaim("Hello");
        hometown();
        names("Athiná", "Emi");
        favFood();
        favOrder("Root Beer","Mozzerella Sticks");
        System.out.println(addTen(10));
        System.out.println("Enter three numbers");
        System.out.println("The product of your numbers are: "+multiply(sc.nextInt(), sc.nextInt(), sc.nextInt()));

        System.out.println(add(2,10.20));
        System.out.println(add(1,2));
        System.out.println(add(4.20,6.9));
        petName();
        sc.nextLine();
        System.out.println("Whats yours?");
        String userPet = sc.nextLine();
        petTwo(userPet);

        System.out.println("Enter two coordinates");

        String cordOne = sc.nextLine();
        String cordTwo = sc.nextLine();
        System.out.println(point(cordOne, cordTwo));
    }


   public static void printName(){
        System.out.println("Athiná");

   }

   public static void callParam(String x) {
        System.out.println(x);
   }


   public static void exclaim(String x) {
        System.out.println(x + "!");
   }

   public static void hometown() {  
    System.out.println("North Massapequa");
    
   }

   public static void names(String x, String y) {
    System.out.println("My name is " + x  +" and my best friends name is "+ y);
   }

   public static void favFood() {
    System.out.println("Steak and Garlic Mash");
    
   }

   public static void favOrder(String x, String y) {
    System.out.println("My favorite drink is "+ x+ " and my favorite app is "+ y);
   }

   public static int addTen(int y){
    return(y + 10);
   }

    public static int multiply (int x, int y, int z){
     return(x * y * z);
   }

   public static int add(int x, int y) {
          return(x+y);
   }

   public static double add(double x, double y) {
     return(x+y);
   } 
   public static double add(int x, double y){
     return(x+y);
   }
     
   public static void petName(){
     String myDog = "Cooper";
     System.out.println("My pets name is " + myDog );
   }

   public static void petTwo(String x){
     System.out.println("Your pet's name is "+ x);
   }

   public static String point(String x, String y) {
     return("("+ x +", "+ y +")");
     
   }


} 