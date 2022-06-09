package June2022;

/**
 * Program of Enum Class
 * 08-06-2022
 * Author:Virja Khune
 */

public class EnumClassExample {
    public static void main(String[] args) {
        Days d= Days.MON;
        switch (d){
            case SUN:
                System.out.println("it is holiday");
                break;
            case MON:
                System.out.println("it is working day");
                break;
            case TUE:
                System.out.println("it is working day");
                break;
        }
    }

}

/**
 * OUTPUT
 * it is working day
 */
