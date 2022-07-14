package July2022;

import java.util.LinkedList;

/**
 * Program Of Linked List
 * 13-07-2022
 * Author:Virja khune
 */

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.add("Civil");
        l.add(10);
        l.add(null);
        l.add("Civil");
        l.set(0, "Computer");
        l.add(0, "Electrical");
        l.removeLast();
        l.addFirst("XYZ");

        System.out.println(l);

    }
}

/**
 * OUTPUT
 * [XYZ, Electrical, Computer, 10, null]
 */
