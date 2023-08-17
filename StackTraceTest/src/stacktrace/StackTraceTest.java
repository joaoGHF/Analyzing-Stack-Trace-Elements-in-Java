package stacktrace;

import java.util.*;

/**
 * A program that displays a trace feature of a recursive method call.
 * Implementing the listing 7.1 of the book Core Java I, by Cay Horstmann
 * @version 1.00 2023-08-17
 * @author joaoGHF
 */
public class StackTraceTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        factorial(n);
    }

    /**
     * Computes the factorial of a number
     * @param n a nom-negative integer
     * @return n! = 1 * 2 * ... * n
     */
    public static double factorial(int n) {
        System.out.println("factorial(" + n + "):");

        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();

        for (StackTraceElement f : frames) {
            System.out.println(f);
        }

        double r;
        if (n <= 1) {
            r = 1;
        } else {
            r = n * factorial(n - 1);
        }

        System.out.println("return " + r);
        return r;
    }
    
}