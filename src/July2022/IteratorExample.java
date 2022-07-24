package July2022;
/**
 * Program Of Iterator
 * 22-07-2022
 * Author:Virja Khune
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

    public static void main(String[] args){

        ArrayList<Integer> sum = new ArrayList();

        sum.add(165);
        sum.add(153);
        sum.add(155);
        sum.add(15);
        sum.add(175);
        sum.add(145);
        sum.add(174);

        int result=0;

        Iterator<Integer> iterate = sum.iterator();

        while(iterate.hasNext()) {
            // Using the forEachRemaining() method
            iterate.forEachRemaining((value) -> System.out.print(value + ", "));
        }

    }

}

/**
 * OUTPUT
 * 165, 153, 155, 15, 175, 145, 174,
 */
