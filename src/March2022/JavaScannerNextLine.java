package March2022;

import java.util.Scanner;

/**
 * Example of java scanner nextLine
 * 29-03-2022
 * Author:Virja Khune
 */
public class JavaScannerNextLine {
    public static void main(String[] args) {
        //Create scanner object class.
        Scanner s= new Scanner(System.in);
        System.out.println("Enter education");

        //Read user input
        String education= s.nextLine();
        System.out.println("Education is: "+education);

    }
}

/**
 * OUTPUT
 * Enter education
 * BE
 * Education is: BE
 *
 * In this program, first we have created scanner class to scan the user input.
 * Then, using nextLine method, read user input from command prompt.
 * Finally, display user entered Education.
 */