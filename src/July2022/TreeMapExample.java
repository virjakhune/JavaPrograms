package July2022;

import java.util.TreeMap;

/**
 * Program Of TreeMap
 * 19-07-2022
 * Author:Virja khune
 */

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap m= new TreeMap();
        m.put(100, "Civil");
        m.put(200, "Electrical");
        m.put(250, "Mechanical");
        m.put(400,500);
        System.out.println(m);

    }
}

/**
 * OUTPUT
 * {100=Civil, 200=Electrical, 250=Mechanical, 400=500}
 */