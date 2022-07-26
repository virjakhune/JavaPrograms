package July2022;

import java.util.HashSet;

/**
 * Program of Hash Set
 * 25-07-2022
 * Author:Virja Khune
 */

public class HashSetExample {
    public static void main(String[] args) {
        HashSet h= new HashSet();
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("D");
        h.add(null);
        h.add(10);
        System.out.println(h.add("D"));
        System.out.println(h);
    }
}

/**
 * OUTPUT
 * false
 * [null, A, B, C, D, 10]
 */
