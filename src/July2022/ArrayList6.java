package July2022;

import java.util.ArrayList;

/**
 * Program for Array List with Exception
 * 09-07-2022
 * Author: Virja Khune
 */
public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("India");
        nameList.add("Russia");
        nameList.add("America");


        try{
            nameList.add(10,"Ukraine");
        }catch (Exception e){
            e.printStackTrace();
            nameList.add("INDEX NOT AVAILABLE");
        }



        //Display All items form Name List
        System.out.println(nameList);

    }
}

/**
 * Output:
 * java.lang.IndexOutOfBoundsException: Index: 10, Size: 3
 * 	at java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:788)
 * 	at java.base/java.util.ArrayList.add(ArrayList.java:513)
 * 	at ArrayList6.main(ArrayList6.java:17)
 * [India, Russia, America, INDEX NOT AVAILABLE]
 */
