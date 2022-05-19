package May2022;

public class MultilevelInheritance {
    public static void main(String[] args) {
        MechanicalGirls mg = new MechanicalGirls();
        System.out.println("The number of Mechanical Girls are:"+mg.students);

    }
}


/**
 * OUTPUT
 * The number of Mechanical Girls are:50
 *
 * In this program, we created Engineering parent class.
 * Then, we created MechanicalBranch child class from Engineering parent class.
 * Then, we created MechanicalGirls child class from MechanicalBranch child class.
 * Then, we created main class and display the number of Mechanical Girls.
 */
