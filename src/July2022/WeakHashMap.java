package July2022;

import java.util.HashMap;

/**
 * Program Of WeakHashMap
 * 20-07-2022
 * Author:virja khune
 */

public class WeakHashMap {
    public static void main(String[] args) throws Exception {
        HashMap m= new HashMap();
        Temp t= new Temp();
        m.put(t, "pune");
        System.out.println(m);

        t= null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(m);

    }
}

/**
 * OUTPUT
 *
 {temp=pune}
 {temp=pune}
 */
