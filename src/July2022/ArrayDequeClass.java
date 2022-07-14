package July2022;

import java.util.ArrayDeque;

/**
 * Program Of Array Deque
 * 14-07-2022
 * Author:Virja khune
 */

public class ArrayDequeClass {
    public static void main(String[] args) {
        ArrayDeque<Integer>ad1= new ArrayDeque<>();
        ad1.add(10);
        ad1.add(100);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}

/**
 * OUTPUT
 * 10
 * 100
 */
