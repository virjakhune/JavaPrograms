package June2022;

import java.lang.reflect.Modifier;

/**
 * Program Of Java Reflection
 * 13-06-2022
 * Author:Virja Khune
 */

public class JavaReflection {
    public static void main(String[] args) {
        try{
            WingA WA= new WingA();
            Class obj= WA.getClass();
            String name= obj.getName();
            System.out.println("Name: "+name);
            int modifier= obj.getModifiers();
            String mod= Modifier.toString(modifier);
            System.out.println("Modifier: "+mod);

            Class superclass= obj.getSuperclass();
            System.out.println("superclass: "+superclass.getName());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

/**
 * OUTPUT
 * Name: June2022.WingA
 * Modifier: public
 * superclass: June2022.Society
 */
