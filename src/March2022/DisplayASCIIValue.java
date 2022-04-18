package March2022;

/**
 * Program to find and display the ASCII value of a character by using type-casting and normal variable assignment operations
 *25-03-2022
 * Author:virja khune
 */
public class DisplayASCIIValue{
    public static void main(String[] args) {
        System.out.println("display ASCII value");
        char chr1= 'A';
        char chr2= 'B';

        //using normal variable assignment operations
        int ascii1=chr1;

        //using type-casting
        int ascii2=(int)chr2;

        System.out.println("ascii1 "+ascii1);
        System.out.println("ascii2 "+ascii2);
    }

}

/**
 * OUTPUT
 * display ASCII value
 * ascii1 65
 * ascii2 66
 *
 * In this program, two characters A and B are stored in character variables.
 * Then, first we take chr1 and store its ASCII value using normal variable assignment operations method into ascii1 variable.
 * Then, second we take char2 and store its ASCII value using type-casting method into ascii2 variable.
 * Finally, ascii1 and ascii2 are printed on the screen using println() function.
 */
