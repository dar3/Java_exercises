package com.dar3.loops;
import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int i = scan.nextInt();
        int result = 1;

        for (int num = 1;  num<=i;  num++){

            result = num * result;
            System.out.println(result);

        }



    }
}
