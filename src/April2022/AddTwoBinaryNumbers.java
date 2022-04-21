package April2022;

/**
 * Program to Add Two Binary Numbers
 * 21-04-2022
 * Author:Virja Khune
 */
public class AddTwoBinaryNumbers {
    public static void main(String[] args) {
        String b1 = "10101";
        String b2 = "10001";

        int i = Integer.parseInt(b1, 2);
        int j = Integer.parseInt(b2, 2);
        int sum = i + j;

        String output = Integer.toBinaryString(sum);
        System.out.println("Addition of two binary number is: " + (output));
    }
}

/**
 * OUTPUT
 * Addition of two binary number is: 100110
 * <p>
 * In this program, we created string variables with binary values.
 * Then, we convert binary string value into an Integer value.
 * Then, we apply addition on two integer number and finally convert output into binary string and display.
 */
