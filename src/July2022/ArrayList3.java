package July2022;

import java.util.ArrayList;

/**
 * Program for Array List with Remove with index.
 * 09-07-2022
 * Author: Virja Khune
 */
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("India");
        nameList.add("Russia");
        nameList.add("America");


        // Remove with Index
        nameList.remove(2);

        //Display All items form Name List
        System.out.println(nameList);

    }
}

/**
 * Output:
 * [India, Russia]
 */
