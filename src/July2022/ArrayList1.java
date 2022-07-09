package July2022;

import java.util.ArrayList;

/**
 * Program for Array List with Get.
 * 09-07-2022
 * Author: Virja Khune
 */
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("India");
        nameList.add("Russia");
        nameList.add("America");

        //Display All items form Name List
        System.out.println(nameList);

        //Display First Item
        System.out.println(nameList.get(0));

    }
}


/**
 * Output:
 * [India, Russia, America]
 * India
 */
