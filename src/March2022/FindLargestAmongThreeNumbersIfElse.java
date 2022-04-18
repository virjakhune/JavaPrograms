package March2022;

/**
 * Program to find the largest among three numbers
 * 31-03-2022
 * Author:Virja Khune
 */
public class FindLargestAmongThreeNumbersIfElse {

    public static void main(String[] args) {
        int a= 10;
        int b= 50;
        int c= 40;

        if(a>= b && a>=c)
            System.out.println(a+ " is the largest number. ");

        else if (b>=a && b>=c)
            System.out.println(b+ " is the largest number. ");

        else
            System.out.println(c+ " is the largest number. ");

    }

}

/**
 * Output
 * 50 is the largest number.
 *
 * In this program, we have created three integer variables.
 * Then we created conditions.
 * Finally, using if else statement, the result displayed on the command prompt.
 */
