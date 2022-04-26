package April2022;

import java.util.Scanner;

/**
 * Program To Display Armstrong Numbers Between Intervals Using Function
 * 25-04-2022
 * Author:Virja Khune
 */
public class DisplayArmstrongNumbersBetweenIntervalsUsingFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start number:");

        int startNo = scan.nextInt();
        System.out.println("Enter end number: ");
        int endNo = scan.nextInt();

        displayArmStrongNumber(startNo,endNo);
    }

    public static void displayArmStrongNumber(int startNo, int endNo){
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
 * Not Armstrong Number
 *
 * First we get start and end number and pass value to function.
 * Inside function, we created four Integer variables, num, originalNum, rem, and sum.
 * Then, using while loop we calculate rem, sum, and original sum.
 *Then,we check the sum is equal to num and then the result display on the screen.
 */