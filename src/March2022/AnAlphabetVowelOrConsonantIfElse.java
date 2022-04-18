package March2022;

/**
 * Program to check whether an alphabet is vowel or consonant
 * 30-03-2022
 * Author:Virja Khune
 */
public class AnAlphabetVowelOrConsonantIfElse {

    public static void main(String[] args) {

        char ch = 'u';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

            System.out.println(ch + " is Vowel");
        else
            System.out.println(ch + " is consonant");
    }

}

/**
 * Output
 * u is Vowel
 *
 * In this program, we have created char variable.
 * Then, we created condition.
 * Finally, using if else statement, the result is displayed on the command prompt.
 */
