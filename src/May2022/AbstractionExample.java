package May2022;


/**
 * Program of Abstract class and method.
 * 20-05-2022
 * Author:Virja Khune
 */
public class AbstractionExample {
    public static void main(String[] args) {
        HorseAnimal hr =new HorseAnimal();
        hr.animalSound();
        hr.sleep();
    }
}


/**
 * OutPut:
 * Horse says: hnon honon hoo
 * Zzz...
 *
 * In this program first we created animal abstract class with one abstract method and one simple method.
 * Then we created Horse Animal class with extended Animal class. Then override abstract method and added println.
 * Finally, inside main method we called abstract method and default method.
 *
 */