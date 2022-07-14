package July2022;

import java.util.PriorityQueue;

/**
 * Program Of Priority Queue
 * 11-07-2022
 * Author:Virja khune
 */

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue q= new PriorityQueue();
        q.add("A");
        q.add("B");
        q.add("C");

        System.out.println(q);
        for (Object obj : q) {
            System.out.println(obj);

        }
    }
}

/**OUTPUT
 * [A, B, C]
 * A
 * B
 * C
 */
