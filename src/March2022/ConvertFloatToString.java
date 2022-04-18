package March2022;

/**
 * Program to convert float to string
 * 25-03-2022
 * Author:Virja Khune
 */

public class ConvertFloatToString {
    public static void main(String args[]) {
        float f = 10.5F;
        String s = String.valueOf(f);

        System.out.println("float: " + f);
        System.out.println("string: " + s);
    }
}

/**
 * OUTPUT
 * float: 10.5
 * string: 10.5
 *
 * In this program, we have created float variable.
 * Then, we created string variable and finally we convert float to string with the help of type-casting.
 * And last, original value and converted value are displayed.
 */
