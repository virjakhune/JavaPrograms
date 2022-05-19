package May2022;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        HP H = new HP();
        System.out.println("The available HP Laptops are: "+H.available);
    }
}


/**
 * OUTPUT
 * The available HP Laptops are: 15
 *
 * In this program, we created Laptop parent class.
 * Then, we created Dell child class from parent class.
 * Then, we created HP Child class from parent class.
 * Then, we created main class and display the available HP laptop.
 */
