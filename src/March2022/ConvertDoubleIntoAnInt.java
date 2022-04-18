package March2022;

/**
 * Program to convert and display double value into an int
 * 25-03-2022
 * Author:Virja Khune
 */

public class ConvertDoubleIntoAnInt {
    public static void main(String[] args) {
        System.out.println("Convert double value into an int");
        double doublevar= 1000.101;

        int intvar= (int)doublevar;

        System.out.println("double value: "+doublevar);

        System.out.println("int value: "+intvar);
    }
}

/**
 * OUTPUT
 * Convert double value into an int
 * double value: 1000.1
 * int: 1000
 *
 * In this program, we have created double variable.
 * then, we created int variable and finally we convert double into an int with the help of type-casting.
 * And last, original value and converted value are displayed.
 */
