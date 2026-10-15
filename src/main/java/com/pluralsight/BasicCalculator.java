package com.pluralsight;


import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

       //Creating a scanner
        Scanner theScanner = new Scanner(System.in);

        //ask the user for the first number
        System.out.print("Enter your first number: ");



        //store the answer for the user
        int firstNumber = theScanner.nextInt();

        //ask the user for the second number
        System.out.print("Enter your second number: ");

        //store the answer for the user
        int secondNumber = theScanner.nextInt();

        theScanner.nextLine();


        //ask the user what operation they want to use
        System.out.print("""
                Possible calculations:
                (A)dd
                (S)ubtract
                (M)ultiply
                (D)ivide
                Please select an option:
                """);

        //store the user's choice
        String operation = theScanner.nextLine();

        //answer the equation
        int product = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber  + "= " + product);


    }


}
