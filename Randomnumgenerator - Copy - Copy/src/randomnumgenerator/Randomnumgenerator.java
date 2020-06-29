

package randomnumgenerator;

import java.util.Random;
import java.util.Scanner;


public class Randomnumgenerator {

    
    public static void main(String[] args) {
     
       Random rand = new Random();
       int rand_int1 = rand.nextInt(1000000000);
       int rand_int2 = rand.nextInt(10000000);
       System.out.print("It's your paysafecard code:"+" "+rand_int1);
       System.out.println(rand_int2);
       System.out.println("Thank you for using my paysafecard codes generator :).");
       System.out.println("Application made by: Dariy Shypka also known as dar3");
       System.out.println("Press ENTER to exit.");
       Scanner scanner = new Scanner(System.in); 
       
scanner.nextLine();
       //a.k.a dar3, darkomelos.
       
    }
    
}
