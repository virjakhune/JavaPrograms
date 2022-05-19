package May2022;

public class Red extends colour {
    @Override
    public void display() {
        System.out.println("Colour is Red");
        super.display();
    }

    public static void main(String[] args) {
        Red r = new Red();
        r.display();
    }

}


/**
 * OUTPUT
 * Colour is Red
 * Inside colour class
 *
 * In this program, we created Colour parent class.
 * Using parent class we created Red child class. Inside child class call display method.
 */

