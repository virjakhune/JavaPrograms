package April2022;

import java.util.Scanner;

/**
 * Program to check Leap Year
 * 04-04-2022
 * Author:Virja Khune
 */

public class CheckLeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter an Year: ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("year is a leap year");
        else
            System.out.println("year is not a leap year");
    }
}

/**
 * OUTPUT
 * Enter an Year:
 * 1990
 * year is not a leap year
 *
 * In this program, we created integer variable.
 * Then, we created scanner class to scan the user input.
 * Then, using nextInt method read integer value from command prompt.
 * Then, we checked the condition using if-else statement.
 * Finally, display the result on command prompt.
 */