package aaa;
//asdas
import java.util.ArrayList;

public class Grupa implements Interfata {

    String nume_grupa;
    ArrayList<Semigrupa> semigrupe;

    public Grupa(String nume_grupa) {
        this.nume_grupa = nume_grupa;
        this.semigrupe=new ArrayList<Semigrupa>();
    }

    @Override
    public void addGrupa(Grupa grupa) {

    }

    @Override
    public void addSemigrupa(Semigrupa semigrupa) {
        semigrupe.add(semigrupa);
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void print() {
        System.out.println("    "+nume_grupa);
        semigrupe.forEach(Semigrupa::print);
    }
}
