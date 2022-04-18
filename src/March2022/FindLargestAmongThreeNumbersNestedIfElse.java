package March2022;

/**
 * Program to find the largest among three numbers using nested if-else statement
 * 31-03-2022
 * Author:Virja Khune
 */

public class FindLargestAmongThreeNumbersNestedIfElse {
    public static void main(String[] args) {

        int x= 20;
        int y= 40;
        int z= 80;

        if(x>=y) {
            if(x>=z)
                System.out.println(x+ " is the largest number. ");
            else
                System.out.println(z+ " is the largest number. ");
        } else{
            if(y>=z)
                System.out.println(y+ " is the largest number. ");
            else
                System.out.println(z+ " is the largest number. ");
        }
        }
    }

/**
 * OUTPUT
 * 80 is the largest number.
 *
 *  In this program, we have created three integer variables.
 *  Then we created conditions.
 *  Finally, using nested if else statement, the result displayed on the command prompt.
 */


