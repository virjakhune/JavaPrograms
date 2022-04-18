package March2022;

import java.util.Scanner;

public class AddOfTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter First Number");
        int first = scanner.nextInt();

        System.out.println("Enter second Number");
        int second = scanner.nextInt();

        int sum = first + second;
        System.out.println("Addition ot two is : "+sum);

    }
}
