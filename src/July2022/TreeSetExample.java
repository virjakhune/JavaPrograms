package July2022;

import java.util.TreeSet;

/**
 * Program Of TreeSet
 * 25-07-2022
 * Author:Virja khune
 */

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet t= new TreeSet();
        t.add ("Y");
        t.add ("y");
        t.add ("A");
        t.add ("B");
        t.add ("C");
        System.out.println(t.toString());
    }
}

/**
 * OUTPUT
 * [A, B, C, Y, y]
 */
