package aaa;
//asdasda
import java.util.ArrayList;

public class Semigrupa implements Interfata{

    String nume_subgrupa;
    ArrayList<Student> studenti;

    public Semigrupa(String nume) {
        this.nume_subgrupa = nume;
        this.studenti=new ArrayList<Student>();
    }


    @Override
    public void addGrupa(Grupa grupa) {

    }

    @Override
    public void addSemigrupa(Semigrupa semigrupa) {

    }

    @Override
    public void addStudent(Student student) {
        studenti.add(student);
    }

    @Override
    public void print() {
        System.out.println("        "+nume_subgrupa);
        studenti.forEach(Student::print);
    }
}
