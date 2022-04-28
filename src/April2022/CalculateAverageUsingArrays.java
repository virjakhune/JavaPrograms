package April2022;

/**
 * Program To Calculate Average Using Arrays
 * 28-04-2022
 * Author:Virja Khune
 */
public class CalculateAverageUsingArrays {
    public static void main(String[] args) {
        int marks[] = new int[4];
        int sum = 0;
        int avg = 0;
        marks[0] = 81;
        marks[1] = 98;
        marks[2] = 88;
        marks[3] = 91;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        avg = sum / marks.length;
        System.out.println("Avg is: " + avg);

    }
}

/**
 * OUTPUT
 * Avg is: 89
 *
 * In this program, we created Integer variables, marks sum and avg.
 * Then, we pass values to array.
 * Then, using for loop we calculate sum.
 * Finally, we calculate avg and the result display on the screen.
 */
