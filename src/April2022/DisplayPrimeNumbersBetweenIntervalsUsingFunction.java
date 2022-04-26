package April2022;

import java.util.Scanner;

/**
 * Program To Display Prime Numbers Between Intervals Using Function
 * 25-04-2022
 * Author:Virja Khune
 */
public class DisplayPrimeNumbersBetweenIntervalsUsingFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scan.nextInt();
        displayPrimeNumber(num);
    }

    public static void displayPrimeNumber(int num){
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
 * 151
 * number is prime
 *
 * In this program, we take the value from scanner.
 * Then, we created Integer variables and using function we calculate prime number.
 * Inside function apply for loop condition.
 * Then, we use if condition to find out the given number is prime or not and finally, the result display on the screen.
 */
