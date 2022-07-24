package July2022;
/**
 *  Program of Navigable Map
 *  21-07-2022
 *  Author:Virja khune
 */

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMapExample {

    public static void main(String[] args){

        NavigableMap<Integer,String> cricketTeam = new TreeMap<>();

        cricketTeam.put(1,"India");
        cricketTeam.put(3,"Aus");
        cricketTeam.put(7,"New Zealand");
        cricketTeam.put(5,"England");

        //Display sorted list.
        System.out.println(cricketTeam.toString());


        //Remove first and last entry
        System.out.println(cricketTeam.pollFirstEntry());
        System.out.println(cricketTeam.pollLastEntry());


        //Display update list
        System.out.println(cricketTeam.toString());


        
    }

}

/**
 * OUTPUT
 * {1=India, 3=Aus, 5=England, 7=New Zealand}
 * 1=India
 * 7=New Zealand
 * {3=Aus, 5=England}
 */