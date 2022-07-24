package July2022;
/**
 * Program of Enum Map
 * 21-07-2022
 * Author:Virja khune
 */

import java.util.EnumMap;

public class EnumMapExample {

    enum Grade{
        SECOND,FIRST,DISTINCTION
    }

    public static void main(String[] args){

        EnumMap<Grade, Integer> marks = new EnumMap<>(Grade.class);
        marks.put(Grade.SECOND,55);
        marks.put(Grade.FIRST,65);
        marks.put(Grade.DISTINCTION,75);


        //Display value of second key
        System.out.println(marks.get(Grade.FIRST));


        System.out.println(marks.toString());


    }

}

/**
 * OUTPUT
 * 65
 * {SECOND=55, FIRST=65, DISTINCTION=75}
 */
