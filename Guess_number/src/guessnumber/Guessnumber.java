
package guessnumber;

import java.util.Random;
import java.util.Scanner;

public class Guessnumber {

    public static void main(String[] args) {
               Random rand = new Random();
               
               int rand_num1 = rand.nextInt(100)+1;
               Scanner sc = new Scanner(System.in);
               double num2 = sc.nextDouble(); 
               
                  while(num2!=rand_num1){}
                  //double num2 =sc.nextDouble();}
               
               
                //  It's NOT FINISHED YET!
               
                
              /* it's good to add "for loop" which will execute the code until you guess the number. It won't close the program before the time
               for(....) in the () write num2==rand_num1 or =! rand_num1 and the rest part 
                to execute  */
            
              /* if(num2>rand_num1){
                   System.out.println("It's not that number. The number is smaller");}
               
               if(num2<rand_num1){
                   System.out.println("It's not that number. The number is bigger");} */
               
                                                                      
                } }
              
                   
               
              
               
               

    
    

