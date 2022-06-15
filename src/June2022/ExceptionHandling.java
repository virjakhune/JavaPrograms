package June2022;

/**
 * Program Of Exception Handling
 * 15-06-2022
 * Author:Virja Khune
 */

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
    }
}

/**
 * OUTPUT
 * java.lang.ArithmeticException: / by zero
 */