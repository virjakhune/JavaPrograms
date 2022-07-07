package July2022;

import java.util.ArrayList;

/**
 * Program of Array List
 * 05-07-2022
 * Author:Virja khune
 */

public class ArrayListInCollectionFramework {
    public static void main(String[] args) {
        ArrayList I= new ArrayList();
        I.add("Computer");
        I.add("Civil");
        I.add("Mechanical");
        I.add(null);

        System.out.println(I);
        I.remove(2);
        System.out.println(I);
        I.add(2, "Electrical");
        I.add("Electronics");
        System.out.println(I);

    }
}

/**
 * OUTPUT
 * [Computer, Civil, Mechanical, null]
 * [Computer, Civil, null]
 * [Computer, Civil, Electrical, null, Electronics]
 */
