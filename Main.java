import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Teacher t1= new Teacher("Tugba","553","MAT");
        Teacher t2= new Teacher("Nur","310","KİM");
        Teacher t3= new Teacher("Önder","66","FİZ");

        Course c1= new Course("Matematik","MAT101","MAT");
        Course c2= new Course("Kimya","KİM102","KİM");
        Course c3= new Course("Fizik","FİZ103","FİZ");

        c1.addTeacher(t1);
        c2.addTeacher(t2);
        c3.addTeacher(t3);

        Student s1= new Student("Can","1316",3,c1,c2,c3);
        s1.addBlukExam(85,75,75);
        s1.addBulkVerbalNote(95,85,85);
        s1.isPass();

        Student s2= new Student("Ozan","1317",3,c1,c2,c3);
        s2.addBlukExam(95,86,93);
        s2.addBulkVerbalNote(100,95,100);
        s2.isPass();

        Student s3= new Student("Anıl","1318",3,c1,c2,c3);
        s3.addBlukExam(93,78,94);
        s2.addBulkVerbalNote(100,90,100);
        s3.isPass();




    }
}