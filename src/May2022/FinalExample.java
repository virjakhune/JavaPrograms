package May2022;

/** Program of final keyword
 * 01-05-2022
 * Author:Virja khune
 */

import java.util.Scanner;

public class FinalExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        final int z = 300;

        int sum = x + y + z;
        System.out.println(sum);
    }
}

/**
 * OUTPUT
 * 100
 * 400
 * 800
 *
 * In this program, we created scanner class object.
 * Then, using scanner object, get two different Integer values and one variable created as a final.
 * Finally, display sum.
 */
