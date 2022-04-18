package March2022;

/**
 * Program to convert string to int
 * 25-03-2022
 * Author:Virja Khune
 */

public class ConvertStringToInt {
    public static void main(String[] args) {
        System.out.println("Convert string value to int value");

        String s= "100";
        int intvar= Integer.parseInt(s);

        System.out.println("string: "+s);
        System.out.println("int value: "+intvar);

    }
}


/**
 * OUTPUT
 * Convert string value to int value
 * string: 100
 * int value: 100
 *
 * In this program, we have created string variable.
 * Then, we created int variable and finally we convert string to int with the help of type-casting.
 * And last, original value and converted value are displayed.
 */