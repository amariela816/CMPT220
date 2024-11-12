import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class fileman {
    public static void main(String[] args) throws Exception{
        File inputFile = new File("intpt.txt");
        Scanner sc = new Scanner(inputFile);
         

        /*String line = "";
        while(sc.hasNext()){
           line = sc.nextLine();
           System.out.println(line);
        }
        //System.out.println("My name is "+ line); 

        PrintWriter pw = new PrintWriter(new FileWriter("intpt.txt",false));
        pw.write("Athiná Vargas");
        pw.close();*/

        List<String> nameList = new ArrayList<String>();
        while(sc.hasNext()){

            nameList.add(sc.nextLine());

        }
        System.out.println(nameList);








    }

   


}  