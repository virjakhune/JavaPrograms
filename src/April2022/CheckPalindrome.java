package April2022;

/**
 * Program To Check Palindrome
 * 22-04-2022
 * Author:Virja Khune
 */
public class CheckPalindrome {
    public static void main(String[] args) {
        int num = 3443;
        int reverse = 0;
        int actualnum = 0;
        actualnum = num;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("reverse number: " + reverse);
        if (actualnum == reverse) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }

    }

}

/**
 * OUTPUT
 * reverse number: 3443
 * number is palindrome
 *
 * In this program, we created Integer variables num, reverse, and actual num.
 * Then, using while loop, we calculate digit, reverse and num.
 * Finally, with the help of if-else statement we check whether the number is palindrome or not and display the result on the screen.
 */
