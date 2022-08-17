public class Student {

    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    int classes;
    double average;
    boolean isPass;

    Student(String name,String stuNo,int classes,Course c1,Course c2,Course c3){

        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.isPass=false;
    }

    void addBlukExam(int note1,int note2,int note3){

        if(note1>=0 && note1<=100) {

            this.c1.note=(note1)*0.60;
        }
        if(note2>=0 && note2<=100) {

            this.c2.note=(note2)*0.60;
        }
        if(note3>=0 && note3<=100) {

            this.c3.note=(note3)*0.60;
        }

    }

    void addBulkVerbalNote(int verbal1,int verbal2,int verbal3){

        if(verbal1>=0 && verbal1<=100) {

            this.c1.verbal=(verbal1)*0.20;
        }
        if(verbal2>=0 && verbal2<=100) {

            this.c2.verbal=(verbal2)*0.20;
        }
        if(verbal3>=0 && verbal3<=100) {

            this.c3.verbal=(verbal3)*0.20;
        }

    }

    void calcAverage(){

        this.average= ((this.c1.note+this.c1.verbal) + (this.c2.note+this.c2.verbal) + (this.c3.note+this.c3.verbal)) / 3;

    }
    void isPass(){

        printNote();

        if(this.average >55){

            System.out.println("Sınıfı geçtiniz!");
        }
        else{

            System.out.println("Sınıfta kaldınız!");
        }

    }

    void printNote(){

        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik notu : " + this.c1.note);
        System.out.println("Kimya notu : " + this.c2.note);
        System.out.println("Fizik notu : " + this.c3.note);

    }

}
