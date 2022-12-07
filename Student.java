package aaa;
///asdasd
public class Student implements Interfata{

    String nume_student;
    String adresa_mail;

    public Student(String nume, String adresa_mail) {
        this.nume_student = nume;
        this.adresa_mail = adresa_mail;
    }


    @Override
    public void addGrupa(Grupa grupa) {

    }

    @Override
    public void addSemigrupa(Semigrupa semigrupa) {

    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void print() {
        System.out.println("            "+nume_student+","+adresa_mail);
    }
}
