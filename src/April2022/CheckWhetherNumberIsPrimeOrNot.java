package April2022;

import java.util.Scanner;

/**
 * Program To Check Whether A Number Is Prime Or Not
 * 22-04-2022
 * Author:Virja Khune
 */
public class CheckWhetherNumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scan.nextInt();
        int changednum = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                changednum = changednum + 1;
            }
        }
        if (changednum == 0) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not prime");
        }
    }


}

/**
 * OUTPUT
 * Enter number
 * 11
 * number is prime
 *
 * In this program, we take the value from scanner.
 * Then, we created Integer variables.
 * Then,we apply for loop condition.
 * Then, we use if condition to find out the given number is prime or not and finally, the result display on the screen.
 */

