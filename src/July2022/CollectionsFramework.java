package July2022;

import java.util.Stack;

/**
 * Program of Collections Framework
 * 04-07-2022
 * Author:Virja khune
 */

public class CollectionsFramework {

    public static void main(String[] args) {
        Stack s= new Stack();
        s.push ("Computer");
        s.push ("Civil");
        s.push ("Mechanical");

        System.out.println("s");
        System.out.println(s.search ("Computer"));
        System.out.println(s.search("Electrical"));
    }
}

/**
 * OUTPUT
 * s
 * 3
 * -1
 */
