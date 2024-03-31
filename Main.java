package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nChoose the number of parameters to pass to SUM:");
        System.out.println("1\n2\n3");
        try {int choice = myObj.nextInt();
        switch (choice) {  
        case 1:
                fun1();
                break;
            case 2:
                fun2();
                break;
            case 3:
                fun3();
                break;
            default:
                System.out.println("Invalid input. Please enter a valid value.");
                main(args);
                }}
        catch  (InputMismatchException e) {    System.out.println("Invalid input. Please enter a valid value.");
        	main(args);
        }     myObj.close();}

    // Method to calculate sum recursively for integer inputs
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    // Method to calculate sum for double inputs
    public static int sum(double k) {
        if (k > 0) {
            return (int) Math.round(k) + sum((int) k - 1);
        } else {
            return 0;
        }
    }

    // Method to calculate sum recursively for a range of integers
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    static void fun1() {
        int sumRes = 0;
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("\nPlease enter an integer:");
            int input = myObj.nextInt();
            sumRes = sum(input);
            System.out.println("Result: " + sumRes);
            myObj.close();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
            fun1();
        }
    }

    static void fun2() {
        int sumRes = 0;
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("\nPlease enter a float:");
            double input1 = myObj.nextDouble();
            sumRes = sum(input1);
            System.out.println("Result: " + sumRes);
            myObj.close();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
            fun2();
        }
    }

    static void fun3() {
        int sumRes = 0;
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("\nPlease enter two integers to pass to SUM:");
            int min = myObj.nextInt();
            int max = myObj.nextInt();
            sumRes = sum(min, max);
            System.out.println("Result: " + sumRes);
            myObj.close();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
            System.out.println("Please make sure that the two numbers are integers.");
            fun3();
        }
    }
}