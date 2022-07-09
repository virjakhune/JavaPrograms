package July2022;

import java.util.ArrayList;

/**
 * Program for Array List with Add with index.
 * 09-07-2022
 * Author: Virja Khune
 */
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("India");
        nameList.add("Russia");
        nameList.add("America");


        // Add New more items
        nameList.add("Australia");
        nameList.add(2,"New Zealand");

        //Display All items form Name List
        System.out.println(nameList);

    }
}

/**
 * Output:
 * [India, Russia, New Zealand, America, Australia]
 */
