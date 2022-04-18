package March2022;

/**
 * Program to compute Quotient and Remainder
 * 28-03-2022
 * Author:Virja Khune
 */

public class ComputeQuotientAndRemainder {
    public static void main(String[] args) {
        int dividend= 20;
        int divisor= 6;

        int quotient = dividend/divisor;
        int remainder = dividend%divisor;
        System.out.println("quotient= "+quotient);
        System.out.println("remainder= "+remainder);
    }
}

/**
 * OUTPUT
 * quotient= 3
 * remainder= 2
 *
 * In this program, we have created two integer variables dividend and divisor.
 * Then we created int quotient and int remainder to compute quotient and remainder.
 * Finally, quotient and remainder are printed on the screen using println() function.
 */
