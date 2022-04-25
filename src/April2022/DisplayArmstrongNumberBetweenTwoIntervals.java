package April2022;

import java.util.Scanner;

/**
 * Program To Display Armstrong Number Between Two Intervals
 * 25-04-2022
 * Author:Virja Khune
 */
public class DisplayArmstrongNumberBetweenTwoIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start number:");

        int startNo = scan.nextInt();
        System.out.println("Enter end number: ");
        int endNo = scan.nextInt();

        for (int i = startNo; i <= endNo; i++) {

            int num = i;
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
}

/**
 * OUTPUT
 * Enter start number:
 * 151
 * Enter end number:
 * 155
 * Not Armstrong Number
 * Not Armstrong Number
 * Armstrong Number
 * Not Armstrong Number
 * Not Armstrong Number
 *
 * In this program, we take the value from scanner.
 * Then, we created Integer variables.
 * Then,we apply for loop to get a number between two intervals.
 * Then, inside for loop we created Integer variables and using while loop we calculate sum of individual cube.
 * Then, we use if condition to check the given number is Armstrong or not and finally, the result display on the screen
 */

