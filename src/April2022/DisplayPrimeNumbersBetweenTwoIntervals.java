package April2022;

import java.util.Scanner;

/**
 * Program To Display Prime Numbers Between Two Intervals
 * 22-04-2022
 * Author:Virja Khune
 */
public class DisplayPrimeNumbersBetweenTwoIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start number: ");

        int startNo = scan.nextInt();
        System.out.println("Enter end number: ");
        int endNo = scan.nextInt();

        for (int i = startNo; i <= endNo; i++) {

            int num = i;
            int changedNo = 0;

            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    changedNo = changedNo + 1;
                }
            }

            if (changedNo == 0) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not prime number");
            }

        }
    }
}

/**
 * OUTPUT
 * Enter start number:
 * 3
 * Enter end number:
 * 9
 * 3 is a prime number
 * 4 is not prime number
 * 5 is a prime number
 * 6 is not prime number
 * 7 is a prime number
 * 8 is not prime number
 * 9 is not prime number
 *
 * In this program, we take the value from scanner.
 * Then, we created Integer variables.
 * Then,we apply for loop to get a number between two intervals.
 * Then, we use if condition to check the given number is prime or not and finally, the result display on the screen
 */
