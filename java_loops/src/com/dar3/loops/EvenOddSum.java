package com.dar3.loops;

import java.util.Scanner;

public class EvenOddSum {
//Even number - liczba parzysta
//Odd number - liczba nieparzysta
    public static void main(String[] args) {
        int input;
        char choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the number");
            input = sc.nextInt();

            if(input %2 == 0){
                System.out.println("Even number");
                evenSum = evenSum + input;
            }

            else{
                System.out.println("Odd number");
                oddSum = oddSum + input;
            }
            System.out.println("Do you want to continue checking Y/N?");
            choice = sc.next().charAt(0);
        }

        while(choice == 'y' || choice == 'Y');

        System.out.println("Even numbers sum: " + evenSum);
        System.out.println("Odd numbers sum: " + oddSum);



    }



}
