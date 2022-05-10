package May2022;

/** Program of class and object
 * 28-04-2022
 * Author:Virja khune
 */

public class ClassAndObjectExample {
    public static void main(String[] args) {


       StudentMarks stud1 = new StudentMarks("ABC",98,96,99,88,81,99);
       stud1.displaySumAndAverage();


        StudentMarks stud2 = new StudentMarks("XYZ",90,90,90,88,81,99);
        stud2.displaySumAndAverage();


    }
}

/**
 * OUTPUT
 * ABC: sum=561 avg=93
 * XYZ: sum=538 avg=89
 *
 * In this program, we created studentMarks class, it contains phy, chem, bio, mat, eng and hindi variable
  and two constructors and one method and method contains sum and avg.
 * Then, we created two objects stud1 and stud2.
 */
