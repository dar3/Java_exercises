package com.dar3.loops;

public class Sum10FirstNatural {

//Task: Write a program to calculate the sum of first 10 natural number.


    public static void main(String[] args) {

        int sum = 0;
        for(int i = 1; i<=10; i++){
            sum = sum + i;


//     for debugging
//            System.out.println(sum);


        }

        System.out.println("Result: " + sum);


    }
}
