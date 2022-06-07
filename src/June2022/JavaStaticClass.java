package June2022;

/**
 * Program of Java Static Class
 * 03-06-2022
 * Author:Virja Khune
 */

class college{
    class civilDept{

        public void displayInfo(){
            System.out.println("I am from civilDept");
        }
    }

    static class MechDept{
        public void displayInfo(){
            System.out.println("I am from MechDept");
        }
    }

}

public class JavaStaticClass {
    public static void main(String[] args) {
        college clg= new college();

        college.civilDept CD= clg.new civilDept();
        CD.displayInfo();

        college.MechDept MD= new college.MechDept();
        MD.displayInfo();

    }
}

/**
 * OUTPUT
 * I am from civilDept
 * I am from MechDept
 */
