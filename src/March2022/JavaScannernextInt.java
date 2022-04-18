package March2022;

import java.util.Scanner;

/**
 * Example of java scanner nextInt()
 * 29-03-2022
 * Author:Virja Khune
 */
public class JavaScannernextInt {
    public static void main(String[] args) {
        //Create scanner object
        Scanner s= new Scanner(System.in);
        //Read first number
        System.out.println("Enter First Number");
        int first = s.nextInt();

        //Read second number
        System.out.println("Enter second Number");
        int second = s.nextInt();

         //Subtraction
        int sub = first - second;
        System.out.println("Subtraction ot two is : "+sub);

    }
}

/**
 * OUTPUT
 * Enter First Number
 * 80
 * Enter second Number
 * 20
 * Subtraction ot two is : 60
 *
 * In this program, first we have created scanner class to scan the user input.
 * Then, using nextInt method read two integer value from command prompt.
 * Finally, display the subtraction result on command prompt.
 */