package July2022;

import java.util.ArrayList;

/**
 * Program for Array List Integer.
 * 09-07-2022
 * Author: Virja Khune
 */
public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        //Display All items form Name List
        System.out.println(list);

        //Display First Item
        System.out.println(list.get(0));

    }
}


/**
 * Output:
 * [10, 20, 30]
 * 10
 */
