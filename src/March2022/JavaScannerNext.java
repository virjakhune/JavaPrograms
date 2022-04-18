package March2022;
import java.util.Scanner;

/**
 * Example of java scanner next()
 * 29-03-2022
 * Author:Virja Khune
 */

public class JavaScannerNext {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String s= scanner.next();

        System.out.println(s);
    }
}


/**
 * OUTPUT
 * virja khune
 * virja
 *
 * In this program,  first we have created scanner class to scan the user input.
 * Then, using next() method read string value from command prompt.
 * Finally, display the result on command prompt.
 */