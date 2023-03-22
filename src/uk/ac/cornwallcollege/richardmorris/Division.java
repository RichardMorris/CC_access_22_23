package uk.ac.cornwallcollege.richardmorris;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A simple class to illustrate error handling in Java.
 * LO: 4.5 implemented error handling within the program
 * Tasks:
 * <ol>
 * <li>Identify the types of thing that can cause errors - arithmetic errors, IO errors</li>
 * <li>How to catch errors in Java</li>
 * <li>How to generate errors</li>
 * </ol>
 *
 */
public class Division {
    static class MyError extends Exception {
        public MyError(String message) {
            super(message);
        }
    }

    /**
     * Divides two numbers, only returning when the result is a whole number
     * @param num the numerator
     * @param denom the denominator
     * @return the result of num/denom
     * @throws ArithmeticException is the result is not exact
     */
    public static int safeDivide(int num,int denom) throws MyError {
        if( num % denom != 0) // % is the modulo operator (similar to remainder)
            throw new MyError("Inexact division");
        return num / denom;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator;
        int denominator = 1;
        int[] results=new int[10];
        int counter = 0;
        do {
            try {
                System.out.println("Input two numbers");
                numerator = scanner.nextInt();
                denominator = scanner.nextInt();
                int result = safeDivide(numerator,denominator);
                System.out.println("" + numerator + " / " + denominator + " = " + result);
                results[counter++] = result;
            } catch (ArithmeticException ex1) {
                System.out.println("ArithmeticException "+ ex1.getMessage());
            } catch (InputMismatchException ex2) {
                System.out.println("Bad input");
                scanner.nextLine();
            } catch (MyError ex3) {
                System.out.println("MyError "+ ex3.getMessage());
            }

        } while(denominator != -1);

        for(int i=0;i<counter;++i) {
            System.out.println(results[i]);
        }


    }

}
