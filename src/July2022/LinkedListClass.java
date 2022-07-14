package July2022;

import java.util.LinkedList;

/**
 * Program Of Linked List
 * 12-07-2022
 * Author:Virja khune
 */

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList q= new LinkedList();
        q.add("A");
        q.add("B");
        q.add("C");
        q.offer("100");

        System.out.println(q);
    }
}

/**
 * OUTPUT
 * [A, B, C, 100]
 */
