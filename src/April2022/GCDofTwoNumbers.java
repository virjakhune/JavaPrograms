package April2022;

/**
 * Program to find GCD of two numbers
 * 21-04-2022
 * Author:Virja Khune
 */
public class GCDofTwoNumbers {
    public static void main(String[] args) {
        int a = 81;
        int b = 153;
        int gcd = 0;

        for (int i = 2; i < a && i < b; ++i) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of a=" + a + ", b=" + b + " is " + gcd);

    }
}

/**
 * OUTPUT
 * GCD of a=81, b=153 is 9
 * <p>
 * In this program, we created Integer variables a,b,and gcd.
 * Then,using for loop and if condition we find out the largest GCD number.
 * Finally, display GCD number.
 */
