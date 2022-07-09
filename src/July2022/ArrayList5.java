package July2022;

import java.util.ArrayList;

/**
 * Program for Array List with Remove All
 * 09-07-2022
 * Author: Virja Khune
 */
public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("India");
        nameList.add("Russia");
        nameList.add("America");


        //Remove all items from array List
        nameList.removeAll(nameList);


        //Display All items form Name List
        System.out.println(nameList);

    }
}

/**
 * Output:
 * []
 */
