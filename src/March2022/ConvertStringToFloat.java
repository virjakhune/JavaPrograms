package March2022;

/**
 * Program to convert string to float
 * 25-03-2022
 * Author:Virja Khune
 */

public class ConvertStringToFloat {
    public static void main(String args[]){
        String s="20.5";
        float f=Float.parseFloat(s);

        System.out.println("String: "+s);
        System.out.println("float: "+f);
    }
}

/**
 * OUTPUT
 *String: 20.5
 * float: 20.5
 *
 * In this program, we have created string variable.
 * Then, we created float variable and finally we convert string to float with the help of type-casting.
 * And last, original value and converted value are displayed.
 */
