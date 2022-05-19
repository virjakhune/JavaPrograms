package May2022;

public class Mango extends Fruit{
    int number = 40;

    public static void main(String[] args) {
        Mango mg = new Mango();
        System.out.println("the colour of mango is: "+mg.colour);
        System.out.println("number of mangoes are: "+mg.number);
    }
}


/**
 * OUTPUT
 * the colour of mango is: yellow
 * number of mangoes are: 40
 *
 * In this program, we created fruit superclass.
 * Then, we created child class from superclass.
 */
