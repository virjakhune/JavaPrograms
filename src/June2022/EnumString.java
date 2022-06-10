package June2022;

/**
 * Program Of Enum String
 * 10-06-2022
 * Author:Virja Khune
 */

public class EnumString {
    public static void main(String[] args) {
        System.out.println("The colour is: "+Colours.RED.toString());
        System.out.println("The colour is: "+Colours.GREEN.name());
    }
}

/**
 * OUTPUT
 * The colour is: RED
 * The colour is: GREEN
 */
