package March2022;

import java.util.Scanner;

/**
 * Program to read a line of text using Scanner
 * 29-03-2022
 * Author:Virja Khune
 */
public class ReadLineOfTextUsingScanner {
    public static void main(String[] args) {
        //Create scanner object
        Scanner text= new Scanner(System.in);
        System.out.println("Enter line of text");

        //Read user input
        String line= text.nextLine();
        System.out.println("Line of text is: "+line);

    }
}

/**
 * OUTPUT
 * Enter line of text
 * xyz
 * Line of text is: xyz
 *
 * In this program, first we have created scanner class object to scan the user input.
 * Then, using nextLine method, read line of text from command prompt.
 * Finally, display user entered line of text on command prompt.
 */
