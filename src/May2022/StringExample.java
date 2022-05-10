package May2022;

/**Program of String class
 * 09-05-2022
 * Author: virja khune
 */

import java.util.Locale;

public class StringExample {
    public static void main(String[] args) {
        String name = "Java";
        String name2 = "Python";


        int len = name.length();
        System.out.println("Length of String: "+len);

        char ch = name.charAt(2);
        System.out.println("3rd Character is: "+ch);


        String subString = name.substring(2);
        System.out.println(subString);

        String lowercase = name.toLowerCase(Locale.ROOT);
        System.out.println(lowercase);

        String uppercase = name.toUpperCase(Locale.ROOT);
        System.out.println(uppercase);

        boolean isEqual = name.equals(name2);
        System.out.println("String equals: "+isEqual);

        boolean isEmpty = name.isEmpty();
        System.out.println("String is Empty: "+isEmpty);

        String concat = name.concat(name2);
        System.out.println("concated strings: "+concat);

        String replace = name.replace("va","wa");
        System.out.println("replaced string: "+replace);

    }
}

/**
 * OUTPUT
 * 3rd Character is: v
 * va
 * java
 * JAVA
 * String equals: false
 * String is Empty: false
 * concated strings: JavaPython
 * replaced string: Jawa
 *
 * In this program, we created string variables name and name2 and perform following operations on variables:
 * operations: check String length.
               Get character using charAt.
               Get substring.
               check uppercase and lowercase using toLowercase and toUppercase.
               check isEqual and isEmpty.
               check concat and replace.
 * Finally, result display on the screen.
 */






