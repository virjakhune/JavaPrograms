package April2022;

/**
 * Program to Reverse A Number
 * 21-04-2022
 * Author:Virja Khune
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 6789;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reverse number is:"+ reverse);


    }
}

/**
 * OUTPUT
 * Reverse number is:9876
 *
 * In this program,we created Integer variables num and reverse respectively.
 * Then, using while loop we calculate digit, reverse and num as follows:
                       int digit= num%10
                                = 6789%10
                                = 9

                         reverse= reverse*10+digit
                                = 0*10+9
                                = 9

                             num= num/10
                                = 6789/10
                                = 678            (Looping until num is not equal to zero)

 * Finally,the reverse number is display on the screen.
 */
