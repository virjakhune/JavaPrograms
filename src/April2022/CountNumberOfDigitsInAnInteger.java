package April2022;

/**
 * Program to Count Number Of Digits In An Integer
 * 21-04-2022
 * Author:Virja Khune
 */
public class CountNumberOfDigitsInAnInteger {
    public static void main(String[] args) {
        int count = 0;
        int num = 12345;
        while (num !=0){

            num = num/10;
            count++;
        }

        System.out.println("Number of Digits are:"+count);

    }
}

/**
 * OUTPUT
 * Number of Digits are:5
 *
 * In this program, we created Integer variables count and num respectively.
 * Then, using while loop, we count until num is not equal to zero.
 * Inside while loop, we divide number by using 10.
 * Finally, display the number of digits.
 */
