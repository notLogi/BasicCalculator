package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = myScanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Possible calculations:\n(A)dd\n(S)ubtract\n(M)ultiply\n(D)ivide");
        System.out.println("Please select an option: ");
        String operation = myScanner.nextLine();
        System.out.println(firstNumber + " * " + secondNumber + " = " + firstNumber * secondNumber);

    }
}
