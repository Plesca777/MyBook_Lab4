package aaa;
//asdasda

import java.util.ArrayList;

public class An implements Interfata {

    String nume_an;
    ArrayList<Grupa> grupe;

    public An(String nume_an) {
        this.nume_an = nume_an;
        this.grupe=new ArrayList<Grupa>();
    }


    @Override
    public void addGrupa(Grupa grupa) {
        grupe.add(grupa);
    }

    @Override
    public void addSemigrupa(Semigrupa semigrupa) {

    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void print() {
        System.out.println(nume_an);
        grupe.forEach(Grupa::print);
    }
}
