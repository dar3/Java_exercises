
package kursjava1;
/**
 *
 * @author darko a.k.a. dar3
 */

import java.util.Scanner;
public class Kursjava1 {

    
    public static void main(String[] args) {
              System.out.println("-------------------------------");
              System.out.println("Age control v.1.0 made by dar3 ");
              System.out.println("-------------------------------");
              System.out.println("Please write your age to enter.");
              System.out.println("-------------------------------");
        Scanner sc = new Scanner(System.in);
      double age = sc.nextDouble();
    
      if(age<=15&&age>=1){
      System.out.println("Sorry, you need to be older :(.");
         System.out.println("Press ENTER to exit.");
       System.out.println("Program made by Dar3");}
      
      if(age>=16&&age<=99){
        System.out.println("You are welcome");
         System.out.println("Press ENTER to exit.");
       System.out.println("Program made by Dar3");}
      
      if(age<=0){
        System.out.println("You can't be so young :D");
         System.out.println("Press ENTER to exit.");
       System.out.println("Program made by Dar3");}
    
    if(age>=100){
    System.out.println("Are you joking?");
       System.out.println("Press ENTER to exit.");
     System.out.println("Program made by Dar3");}
    //this scanner below is for prevent console from closing when running builded program.
    Scanner scanner = new Scanner(System.in); 
 scanner.nextLine();


            }
        }
    
    

    

       
        
    
   
            
            
      
    
        
  
            
    
    

