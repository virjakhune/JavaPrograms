package May2022;
/**
 * Program of Interface
 * 20-05-2022
 * Author:Virja Khune
 */
public class WatchExample implements Watch{
    @Override
    public void tickTick() {
        System.out.println("Tik Tik ...");
    }

    public static void main(String[] args) {
        WatchExample we = new WatchExample();
        we.tickTick();
    }
}
/**
 * Output:
 * Tik Tik ...
 *
 *
 * In this program first we created one interface Watch and then in watch example class implement it.
 * finally, called interface method and display message.
 */
