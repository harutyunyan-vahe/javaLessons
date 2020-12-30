package com.vahe;

import java.util.Scanner;

public class ConsoleInput {




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Please input your text ");
//        String str = scan.nextLine();
//
//
//        System.out.println(str.toUpperCase());
        int firstNumber = 1;
        int secondNumber = 1;
        System.out.println("In order to stop program input 0 and 0");

        while (firstNumber != 0 && secondNumber != 0) {
            System.out.println("Please input first number");
            firstNumber = scan.nextInt();
            System.out.println("Please input second first number");
            secondNumber = scan.nextInt();
            System.out.println("Result is " + (firstNumber + secondNumber));
        }
    }
}
