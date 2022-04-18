package April2022;

/**
 * Program to check whether a Character is Alphabet or Not
 * 05-04-2022
 * Author:Virja Khune
 */

public class CheckWhetheraCharacterIsAlphabetOrNot {
    public static void main(String[] args) {

        char A = '8';

        if ((A >= 'a' && A <= 'z') || (A >= 'A' && A <= 'Z'))
        {
            System.out.println(A + " is an Alphabet");
        }else{
            System.out.println(A + " is not an Alphabet");

        }
    }
}

/**
 *OUTPUT
 * 8 is not an Alphabet
 *
 * In this program, we created char variable.
 * Then, we take the condition i.e. (A>='a' && A<='z') || (A>='A' && A<='Z')
 * Finally, the result is displayed on the screen using println() function.
 */