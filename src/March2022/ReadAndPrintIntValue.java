package March2022;

import java.util.Scanner;

/**
 * Program to read and print an integer value
 * 28-03-2022
 * Author:Virja Khune
 */
public class ReadAndPrintIntValue {
    public static void main(String[] args) {
        //Create scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer value");

        //Read integer value. if user enter other than integer value then application will throw exception
        int x = scanner.nextInt();
        System.out.println("Value of x: "+x);

    }
}

/**
 * OUTPUT
 * Enter integer value
 * 50
 * Value of x: 50
 *
 * In this program, first we have created scanner class to scan the user input.
 * Then, using nextInt method read an integer value from command prompt.
 * Finally, display user entered integer value.
 */


