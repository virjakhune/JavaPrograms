package April2022;

import java.util.Scanner;

/**
 * Program to display Fibonacci Series
 * 21-04-2022
 * Author:Virja Khune
 */
public class DisplayFibonacciSeries {
    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 1;
        int result = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter limit for fibonacci series");
        int limit = scan.nextInt();

        System.out.print(x1 + ",");
        System.out.print(x2 + ",");

        for (int i = 2; i <= limit; i++) {
            result = x1 + x2;
            if (i == limit) {
                System.out.print(result);
            } else {
                System.out.print(result + ",");
            }
            x1 = x2;
            x2 = result;
        }

    }
}

/**
 * OUTPUT
 * Enter limit for fibonacci series
 * 15
 * 0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610
 *
 * In this program, we created integer variables, x1, x2 and result.
 * Then, by creating scanner object we print the limit for fibonacci series.
 * Then, we print the value of x1 and x2.
 * using for loop condition we print the result.
 * for printing fibonacci series, here we use the swapping logic.
 */
