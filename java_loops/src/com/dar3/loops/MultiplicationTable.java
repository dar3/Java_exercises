package com.dar3.loops;

import java.util.Scanner;

public class MultiplicationTable {

//Task: Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter positive number");
        int i = scan.nextInt();

        if(i<=0)
        {
            System.out.println("The number you have entered is not positive.");
        }

        else
        {
            for( int a = 1; a<=10; a++) {

                System.out.println( i + " * " + a + " = " + i * a);

            }
        }

    }

}
