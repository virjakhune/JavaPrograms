package March2022;

/**
 * Program to convert int to string
 * 25-03-2022
 * Author:Virja Khune
 */

public class ConvertIntToString {
    public static void main(String[] args) {
        System.out.println("Convert int value to string value");
        int intvar= 100;

        String s= String.valueOf(intvar);

        System.out.println("int value: "+intvar);
        System.out.println("String: "+s);
    }
}

/**
 * OUTPUT
 * Convert int value to string value
 * int value: 100
 * String: 100
 *
 * In this program, we have created integer variable.
 * Then, we created string variable and finally we convert int to string with the help of type-casting.
 * And last, original value and converted value are displayed.
 */
