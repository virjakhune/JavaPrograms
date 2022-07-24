package July2022;
/**
 * Program Of Sorted Map
 * 22-07-2022
 * Author:Virja Khune
 */

import java.util.EnumMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

    public static void main(String[] args){

        SortedMap<Integer,String> nameList = new TreeMap<>();

        nameList.put(2,"Sachin");
        nameList.put(1,"Virja");
        nameList.put(7,"Aman");
        nameList.put(3,"Kunal");
        nameList.put(5,"Pravin");
        nameList.put(6,"Adarsh");

        //Display sorted list.
        System.out.println(nameList.toString());


    }

}

/**
 * OUTPUT
 * {1=Virja, 2=Sachin, 3=Kunal, 5=Pravin, 6=Adarsh, 7=Aman}
 */
