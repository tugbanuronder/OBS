public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double verbal;

    Course(String name,String code,String prefix){

        this.name=name;
        this.code=code;
        this.prefix=prefix;
        double note=0.0;
        double verbal=0.0;

    }

    void addTeacher(Teacher teacher){

        if(this.prefix.equals(teacher.branch)){

            this.teacher=teacher;
            System.out.println("İşlem başarılı.");
        }
        else {

            System.out.println(this.name + "Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }

    void printTeacher(){

        if(teacher !=null){

            System.out.println(this.name + " dersinin akademisyeni : " + teacher.name);
        }
        else {

            System.out.println(this.name + " dersine akademisyen atanmamıştır.");
        }

    }
}
