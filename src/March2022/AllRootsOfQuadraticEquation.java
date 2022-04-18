package March2022;



/**Program to find all roots of a quadratic equation
 * 31-03-2022
 * Author:Virja Khune
 */

public class AllRootsOfQuadraticEquation {
    public static void main(String[] args) {
        // value of a, b, and c
        double a = 1.5, b = 2.0, c = 2.5;
        double root1, root2;


        double d = b * b - 4 * a * c;
        System.out.println("value of determinant is: " + d);


        if (d > 0) {


            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        } else if (d == 0) {


            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        } else {


            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);


        }


    }
}

/**
 * OUTPUT
 * value of determinant is: -11.0
 * root1 = -0.67+1.11i
 * root2 = -0.67-1.11i
 *
 * In this program, first we created double variable.
 * Then, we calculated determinant. After determinant value, with the help of if else
 * we checked whether determinant(d) is greater than 0 or not. If d is greater than 0 then we calculated root1 and root2 value.
 * Then we checked the next condition i.e. d==0. then we calculated root1 and root2 value.
 * Then we find out the real and imaginary value.
 * Finally, the result is displayed on the command prompt.
 */