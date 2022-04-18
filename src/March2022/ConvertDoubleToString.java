package March2022;

/**
 * Program to convert double to string
 * 25-03-2022
 * Author:Virja Khune
 */

public class ConvertDoubleToString {
    public static void main(String args[]) {
        double d = 20.5;
        String s = String.valueOf(d);
        System.out.println("double: " + d);
        System.out.println("string: " + s);
    }
}

/**
 * OUTPUT
 *double: 20.5
 * string: 20.5
 *
 * In this program, we have created double variable.
 * Then, we created string variable and finally we convert double to string with the help of type-casting.
 * And last, original value and converted value are displayed.
 */
