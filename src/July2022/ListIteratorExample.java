package July2022;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Program Of ListIterator
 * 26-07-2022
 * Author:Virja khune
 */

public class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.add ("virja");
        l.add ("sachin");
        l.add ("ira");
        l.add ("vira");
        System.out.println(l);

        ListIterator ltr= l.listIterator();
        while (ltr.hasNext()) {
            String s= (String)ltr.next();
            if(s.equals("sachin")) {
                ltr.remove();
            }
            else if(s.equals("vira")) {
                ltr.add("Aisha");
            }
            else if(s.equals("ira")) {
                ltr.set("Adi");
            }
        }
        System.out.println(l);
    }
}

/**
 * OUTPUT
 * [virja, sachin, ira, vira]
 * [virja, Adi, vira, Aisha]
 */
