package June2022;

/**
 * Program of Nested And Inner Class
 * 02-06-2022
 * Author:Virja Khune
 */

class outer {
    int A = 10;
    static int B = 20;

    class inner {
        public void m1() {
            System.out.println(A);
            System.out.println(B);
        }
    }
}

public class NestedAndInnerClassExample {
        public static void main(String[] args) {
            new outer().new inner().m1();
        }
}

/**
 * OUTPUT
 * 10
 * 20
 */


