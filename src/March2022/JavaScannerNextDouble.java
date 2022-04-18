package March2022;

import java.util.Scanner;

/**
 * Example of java scanner nextDouble()
 * 29-03-2022
 * Author:Virja Khune
 */

public class JavaScannerNextDouble {
    public static void main(String[] args) {
        //Create Scanner class object.
        Scanner d= new Scanner(System.in);
        System.out.println("Enter double value");

        //Read double value.
        double d1= d.nextDouble();
        System.out.println("value of d1 is: "+d1);
    }
}

/**
 * OUTPUT
 * Enter double value
 * 1000.10
 * value of d1 is: 1000.1
 *
 * In this program, first we have created scanner class to scan the user input.
 * Then, using nextDouble method read an double value from command prompt.
 * Finally, display user entered double value.
 */
