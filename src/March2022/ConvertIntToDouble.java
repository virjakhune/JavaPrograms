package March2022;

/**
 * Program to convert and display ASCII value of a character by using type-casting
 * 25-03-2022
 * Author:Virja Khune
 */

public class ConvertIntToDouble {
    public static void main(String[] args) {
        System.out.println("Convert int value to double value");
        int intvar= 100;

        double doublvar=(double) intvar;

        System.out.println("Int Value: "+intvar);

        System.out.println("Double: "+doublvar);

    }
}


/**
 *OUTPUT
 * Convert int value to double value
 * Int Value: 100
 * Double: 100.0
 *
 * In this program, we have created integer variable.
 * then, we created double variable and finally we convert int to double with the help of type-casting.
 * And last, original value and converted value are displayed.
 */