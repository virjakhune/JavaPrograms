package April2022;

/**
 * Program To Calculate The Power Of A Number
 * 22-04-2022
 * Author:Virja Khune
 */
public class CalculatePowerOfNumber {
    public static void main(String[] args) {
        int base = 5;
        int exponent = 6;
        int num = 1;

        for (int i = 0; i < exponent; i++) {
            num = base * num;
        }
        System.out.println("Power of number is:" + num);
    }
}

/**
 * OUTPUT
 * Power of number is:15625
 *
 * In this program, we created three Integer variables base, exponent and num respectively.
 * Then, using for loop we calculate power of number.
 * Finally, result display on the screen.
 */
