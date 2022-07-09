package July2022;

import java.util.ArrayList;

/**
 * Program for Array List with list capacity
 * 09-07-2022
 * Author: Virja Khune
 */
public class ArrayList9 {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();

        //Now 'list' can hold 10 elements (Default Initial Capacity)

        list.ensureCapacity(20);

        //Now 'list' can hold 20 elements.

        list.add("ONE");

        list.add("TWO");

        list.add("THREE");

        list.add("FOUR");

        System.out.println("Size of List Before Trim: "+list.size());

        //reducing the current capacity to current size of an ArrayList.

        list.trimToSize();

        System.out.println("Size of List After Trim: "+list.size());
    }
}


/**
 * Output:
 * Size of List Before Trim: 4
 * Size of List After Trim: 4
 */
