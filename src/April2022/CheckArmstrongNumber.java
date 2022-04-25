package April2022;

/**
 * Program To Check Armstrong Number
 * 25-04-2022
 * Author:Virja Khune
 */

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        int num = 4113;
        int originalNum=num;
        int rem=0;
        int sum=0;

        while(originalNum!=0){
            rem = originalNum % 10;
            sum = sum+(rem * rem* rem);

            originalNum=originalNum/10;
        }

        if(sum == num){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }

    }
}

/**
 * OUTPUT
 * Not Armstrong Number
 *
 * In this program, we created four Integer variables, num, originalNum, rem, and sum.
 * Then, using while loop we calculate rem, sum, and original sum as follows:
                     num= 4113
                     originalNum= 4113
                     sum= 0
                     rem= 0

                    1]rem= originalNum%10
                         = 4113%10
                         = 3

                     sum = sum+(rem*rem*rem)
                         = 0+(3*3*3)
                         = 27

             originalNum = originalNum/10
                         = 4113/10
                         = 411          .....(continues loop until originalNum is not equal to zero)
 *Then,we check the sum is equal to num and then the result display on the screen.
 */
