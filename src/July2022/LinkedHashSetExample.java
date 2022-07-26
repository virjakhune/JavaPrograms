package July2022;

import java.util.LinkedHashSet;

/**
 * Program of Linked Hash Set
 * 25-07-2022
 * Author:Virja khune
 */

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet h= new LinkedHashSet();
        h.add ("A");
        h.add ("B");
        h.add ("C");
        h.add ("D");
        h.add (null);
        h.add (10);
        System.out.println(h.add ("Z"));
        System.out.println(h);
    }
}

/**
 * OUTPUT
 * true
 * [A, B, C, D, null, 10, Z]
 */
