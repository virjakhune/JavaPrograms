package July2022;

import java.util.Vector;

/**
 * Program of Vector
 * 06-07-2022
 * Author:Virja khune
 */

public class VectorClass {
    public static void main(String[] args) {
        Vector V= new Vector();
        System.out.println(V.capacity());

        for (int i=1; i<=10; i++) {
            V.addElement(i);
        }
        System.out.println(V.capacity());
        V.addElement("Civil");
        System.out.println(V.capacity());
        System.out.println(V);
    }
}

/**
 * OUTPUT
 * 10
 * 10
 * 20
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Civil]
 */
