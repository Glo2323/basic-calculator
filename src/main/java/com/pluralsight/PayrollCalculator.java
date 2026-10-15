package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        //Create scanner
        Scanner messiScanner = new Scanner(System.in);


        //their name
        System.out.print("What is your name: ");


        String name = messiScanner.nextLine();


        //their hours worked
        System.out.print("How many hours worked: ");

        double hoursWorked = messiScanner.nextDouble();


        //their pay rate

        System.out.print("What's your pay rate: ");

        double payRate = messiScanner.nextDouble();


        //display employee's names and their gross pay

        double grossPay = hoursWorked * payRate;

        System.out.printf("Your name is %s and your gross pay is %.2f", name, grossPay);




    }

}
