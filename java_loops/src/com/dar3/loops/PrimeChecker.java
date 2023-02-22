package com.dar3.loops;

import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter the positive integer ");
        number = sc.nextInt();

        boolean flag = true;

        for(int i = 2; i < number; i++)
        {
            if(number % i == 0)
            {
                flag = false;
                break;
            }
        }

        if(flag && number > 1)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("It's not a prime number");
        }

    }
}

