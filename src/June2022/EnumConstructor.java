package June2022;

/**
 * program of enum constructor
 * 09-06-2022
 * Author:Virja Khune
 */

public class EnumConstructor {
    public static void main(String[] args) {
        Fruits[] f= Fruits.values();
        for (Fruits f1:f){
            System.out.println(f1+"....."+f1.getprice());
        }
    }
}

/**
 * OUTPUT
 * Mango.....150
 * Banana.....50
 * Apple.....120
 * Orange.....80
 */
