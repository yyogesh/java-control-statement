package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not found");
        }

        for(int i = 1; i <= 10; i++) {
            System.out.println("Number is " + i);
        }

        for(int i = 1;
            i <= 10;
            i = i+2) {
            System.out.println("Number is odd " + i);
        }

        int sum = 0;

        for(int i = 1; i <= 100;  i++) {
            sum += i;
            //sum = sum + i
            // 0 + 1  ==> 1
            // 1 + 2 ==> 3
        }
        System.out.println("Sum = " + sum);

        for(int i = 10; i >= 1; i--) {
            System.out.println("Number is " + i);
        }

//        for (int i = 1; i <= 10; --i) {
//            System.out.println("Hello");
//        }


        int x = 1;

        while(x <= 5) {
           System.out.println("While loop " + x);
           x++;
        }

        int sum1 = 0;
        // create an object of Scanner class
        Scanner input = new Scanner(System.in);
        // take integer input from the user
        System.out.println("Enter a number");
        int number = input.nextInt();

        // while loop continues
        // until entered number is positive
        while (number >= 0) {
            // add only positive numbers
            sum1 += number;

            System.out.println("Enter a number");
            number = input.nextInt();
        }

        System.out.println("Sum = " + sum1);


        int y = 1;

        do {
            System.out.println("do While loop " + y);
            y++;
        } while(y <= 5);


        for (int i = 1; i <= 10; ++i) {

            // if the value of i is 5 the loop terminates
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        Double number1, sum2 = 0.0;


//        while (true) {
//            System.out.print("Enter a number: ");
//
//            // takes double input from user
//            number1 = input.nextDouble();
//
//            // if number is negative the loop terminates
//            if (number1 < 0.0) {
//                break;
//            }
//
//            sum2 += number;
//        }
//        System.out.println("Sum = " + sum2);


        for(int i=0; i<5; i++) {
            System.out.print("* ");
        }

        for(int i=0; i<5; i++) {
            System.out.println("* ");
        }

        System.out.println(" ================================== ");
        for(int i=0; i<5; i++) { // i = 1
            for(int j = 0; j <= i; j++ ) { // i = 1 j = 0, 1
                System.out.print("* ");
            }
            System.out.println(i + " ");
        }

        // *
        // *    *
        // *    *    *

    }
}
