
//NOT FINISHED. Everything works except using keys to run program.

package rolladice;

import java.util.Random;
import java.util.Scanner;

public class Rolladice {

public static void key(){
    int key1= 3333;
    String key2="wktr_mfg45nof";
    String key3="kabak_kbk7organe";
    String key4="chcialbys";
}

    public static void welcome(){
        System.out.println("Random number generator v.1.0 by Dar3 A.K.A. dar333");
        System.out.println("In this version the minimum number is 1. Maximum writes user.");
        System.out.println(" ");
        System.out.println("Write the maximum number you want to get randomized");}

    public  static void code(){

            Scanner sc = new Scanner(System.in);
            int user_num = sc.nextInt();
            if (user_num>0){
            System.out.println("Press ENTER to randomize.");
            Scanner scanner = new Scanner(System.in); //This two Scanners will wait till user doesn't press Enter or write something and press Enter.
            scanner.nextLine();// And then it will execute the rest part of the code.
            Random rand = new Random();

        int rand_num1 = rand.nextInt(user_num)+1;      //+1 is to make generated numbers from 1 to user_
        if(rand_num1>0){
        System.out.println("Generating [IIIIIIIII]");
        System.out.println("You got number:"+" "+ rand_num1);} }

        else{
        System.out.println("You should enter numbers which are greater or equal 1.");}
    }


    public static void main(String[] args) {

key();
welcome();
code();




          //this scanner below is to prevent console from closing when running builded program. It's without Scanner scanner= new... because it's already defined
       /*   System.out.println("Thank you for using my program. I hope you like it :).Program made by Dar3");
          System.out.println("Press ENTER to exit the program");
        scanner.nextLine(); */
    }
}
            
        
          







      
          
      
    
    

