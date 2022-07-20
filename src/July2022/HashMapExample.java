package July2022;

import java.util.*;

/**
 * Program Of HashMap
 * 18-07-2022
 * Author:Virja khune
 */

public class HashMapExample {
    public static void main(String[] args) {
        HashMap m = new HashMap<>();
        m.put("Civil", 100);
        m.put("Computer", 200);
        m.put("Electrical", 400);
        m.put("Mechanical", 500);
        System.out.println(m);

        Set s = m.keySet();
        Collection c = m.values();
        Set s1 = m.entrySet();

        Iterator itr = s1.iterator();
        while (itr.hasNext()) {
            Map.Entry m1 = (Map.Entry) itr.next();
            if (m1.getKey().equals("Mechanical")) ;
            m1.setValue(10000);

        }

    }

}

/**
 * OUTPUT
 * {Civil=100, Mechanical=500, Computer=200, Electrical=400}
 */