package March2022;

/**
 * Program to swap two numbers
 * 28-03-2022
 * Author:Virja Khune
 */

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a= 50;
        int b= 100;
        int c;

        System.out.println("initial value of a= "+a +" and b= "+b);


        // Swap two numbers
        c=a;
        a=b;
        b=c;

        System.out.println("After swap value of a= "+a +" and b= "+b);

    }
}

/**
 * OUTPUT
 *initial value of a= 50 and b= 100
 * After swap value of a= 100 and b= 50
 *
 * In this program, we have created integer variables a, b, and c.
 * Then, initial value of a and b are printed on the screen.
 * Then, we have swap values of a & b using third variable c.
 * Finally, swap value of a and b are printed on the screen using println() function.
 */