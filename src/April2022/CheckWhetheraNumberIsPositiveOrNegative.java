package April2022;



/**
 * Program to check whether a number is positive or negative
 * 05-04-2022
 * Author:Virja Khune
 */

public class CheckWhetheraNumberIsPositiveOrNegative {
    public static void main(String[] args) {
        int num=500;

        if(num>0) {
            System.out.println("The number is positive");
        }
        else if(num<0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("The number is zero");
        }
    }

}

/**
 * OUTPUT
 * The number is positive
 *
 * In this program, we created integer variable.
 * First, we take the condition i.e. the number is positive.
 * Then, we take second condition i.e. the number is negative.
 * Again, we take the condition i.e. the number is zero.
 * Finally, the result is displayed on the screen using println() function.
 */

