package March2022;

/**
 * Program to convert string to double
 * 25-03-2022
 * Author:Virja Khune
 */

public class ConvertStringToDouble {
    public static void main(String args[]) {
        String s = "20.5";
        double d = Double.parseDouble(s);
        System.out.println("String: " + s);
        System.out.println("double: " + d);
    }
}

/**
 * OUTPUT
 *String: 20.5
 * double: 20.5
 *
 * In this program, we have created string variable.
 * Then, we created double variable and finally we convert string to double with the help of type-casting.
 * And last, original value and converted value are displayed.
 */
