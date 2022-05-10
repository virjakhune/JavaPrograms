package May2022;

public class StudentMarks {

    String studentName;
    int phy;
    int chem;
    int bio;
    int math;
    int eng;
    int hindi;

 public StudentMarks(String studentName,int phy,int chem,int bio,int math,int eng,int hindi){

     this.studentName = studentName;
     this.phy = phy;
     this.chem = chem;
     this.bio = bio;
     this.math = math;
     this.eng = eng;
     this.hindi = hindi;
 }

    public void displaySumAndAverage(){
        int sum = phy+chem+bio+math+eng+hindi;
        int avg = sum / 6;

        System.out.println(studentName+": sum="+sum+" avg="+avg);
    }
}
