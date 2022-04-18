package March2022;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Read BigInteger and BigDecimal
 * 29-03-2022
 * Author:Virja Khune
 */

public class ReadBigIntegerAndBigDecimal {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        BigInteger number= scanner.nextBigInteger();
        BigDecimal num= scanner.nextBigDecimal();
        System.out.println("number is: "+number);
        System.out.println("number is: "+num);


    }
}



/**
 * OUTPUT
 * 123456789
 * 123456789.10
 * number is: 123456789
 * number is: 123456789.10
 *
 * In this program,  first we have created scanner class to scan the user input.
 * Then, using nextBigInteger() and nextBigDecimal method read integer and decimal value from command prompt.
 * Finally, display the result on command prompt.
 */