package July2022;

import java.util.ArrayList;

/**
 * Program for Array List with Add All
 * 09-07-2022
 * Author: Virja Khune
 */
public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("India");
        nameList.add("Russia");
        nameList.add("America");


        ArrayList<String> secondNameList = new ArrayList<String>();
        secondNameList.add("IND");
        secondNameList.add("RUS");
        secondNameList.add("USA");

        //Using add All , put all second list into single list
        nameList.addAll(secondNameList);

        //Display All items form Name List
        System.out.println(nameList);

    }
}

/**
 * Output:
 * [India, Russia, America, IND, RUS, USA]
 */
