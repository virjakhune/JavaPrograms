package July2022;

import java.util.ArrayList;

/**
 * Program for Array List with double and check values.
 * 09-07-2022
 * Author: Virja Khune
 */
public class ArrayList10 {
    public static void main(String[] args)
    {
        ArrayList<Double> list = new ArrayList<Double>();

        list.add(1.1);

        list.add(11.11);

        list.add(111.111);

        list.add(1111.1111);

        //Checking whether list conatins '111.1111'

        System.out.println("Item is available: "+list.contains(111.1111));    //Output : false
    }
}


/**
 * Output:
 * Item is available: false
 */
