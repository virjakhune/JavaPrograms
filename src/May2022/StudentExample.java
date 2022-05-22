package May2022;

/**
 * Program of Encapsulation
 * 20-05-2022
 * Author:Virja Khune
 */
public class StudentExample {

    public void displayUserDetails(Student student){
        System.out.println(student.getName());
        System.out.println(student.getMarks());
    }

    public static void main(String[] args) {
        StudentExample se = new StudentExample();
        Student student = new Student();
        student.setMarks(88);
        student.setName("Virja");

        se.displayUserDetails(student);


    }

}

/**
 * Output:
 * Virja
 * 88
 *
 * In this example first we created model class[Student] then created getter setter methods.
 * Later we created main class with display student details method.
 * Finally, we created object of main class and model class and pass student details to student object and
 * using main class object display student details.
 */
