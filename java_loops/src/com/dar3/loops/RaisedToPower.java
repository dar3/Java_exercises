package com.dar3.loops;

import java.util.Scanner;

public class RaisedToPower {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter the number to be raised ");
        int number = sc.nextInt();
        System.out.println("Please enter the power");
        int power = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        System.out.println("Result: " + result);

    }

}
