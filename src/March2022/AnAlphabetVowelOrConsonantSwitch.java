package March2022;

/**
 * Program to check whether an alphabet vowel or consonant using switch statement
 * 30-03-2022
 * Author:Virja Khune
 */
public class AnAlphabetVowelOrConsonantSwitch {

    public static void main(String[] args) {

        char ch = 'x';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}

/**
 * OUTPUT
 * x is consonant
 *
 * In this program, we have created char variable.
 * Then, we created condition.
 * Finally, using switch statement, the result is displayed on the command prompt.
 */
