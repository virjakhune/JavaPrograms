package June2022;

/**
 * Program of Anonymous Inner Class
 * 04-06-2022
 * Author:Virja Khune
 */

public class AnonymousInnerClass {
    public static void main(String[] args) {
        pizza p= new pizza(){
            public void taste(){
                System.out.println("spicy");
            }

        };
        p.taste();
        //pizza p1= new pizza();
       // p1.taste();

        pizza p2= new pizza(){
            public void taste(){
                System.out.println("salty");
            }
        };
        p2.taste();

    }
}

/**
 * OUTPUT
 * spicy
 * salty
 */
