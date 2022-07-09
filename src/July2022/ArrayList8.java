package July2022;

import java.util.ArrayList;

/**
 * Program for Array List with Addition Of all Members.
 * 09-07-2022
 * Author: Virja Khune
 */
public class ArrayList8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        int sum= 0;

        for (int i = 0; i < list.size(); i++) {
                sum = sum + list.get(i);
        }

        //Display SUM
        System.out.println("Sum Of Array List is: "+sum);
    }
}


/**
 * Output:
 * Sum Of Array List is: 60
 */
