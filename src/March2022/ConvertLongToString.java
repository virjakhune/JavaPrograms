package March2022;

/**
 * Program to convert long to string
 * 25-03-2022
 * Author:Virja Khune
 */

public class ConvertLongToString {
    public static void main(String args[]){
      Long l=10000L;
      String s=String.valueOf(l);

      System.out.println("Long value: "+l);
      System.out.println("String: "+s);
    }

}

/**
 * OUTPUT
 * Long value: 10000
 * String: 10000
 *
 *  In this program, we have created long variable.
 *  Then, we created string variable and finally we convert long to string with the help of type-casting.
 *  And last, original value and converted value are displayed.
 */
