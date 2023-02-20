package com.dar3.loops;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        int a;
        int reverse = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number please");
        a = sc.nextInt();

        int temp = a;
        int remainder;

        while(temp>0){
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }

        System.out.println("Reverse of " + a + " = " + reverse);
    }
}
