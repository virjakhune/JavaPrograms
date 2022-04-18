package March2022;

/**
 * Program to convert string to long
 * 25-03-2022
 * Author:Virja Khune
 */

public class ConvertStringToLong {

    public static void main(String args[]) {
        String s = "1000";
        Long l = Long.parseLong(s);

        System.out.println("String: " + s);
        System.out.println("Long value: " + l);
    }
}

/**
 * OUTPUT
 * String: 1000
 * Long value: 1000
 *
 *  In this program, we have created string variable.
 *  Then, we created long variable and finally we convert string to long with the help of type-casting.
 *  And last, original value and converted value are displayed.
 */



