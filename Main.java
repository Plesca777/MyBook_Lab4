package aaa;

import javax.lang.model.element.Element;
//dasd
public class Main {

    public static void main(String[] args) {

        An info3 = new An("Informatica 3");

         Grupa grupa_1=new Grupa("grupa_1");
         Grupa grupa_2=new Grupa("grupa_2");
         Grupa grupa_3=new Grupa("grupa_3");

         Semigrupa semigrupa_11=new Semigrupa("semigrupa_1.1");
        Semigrupa semigrupa_12=new Semigrupa("semigrupa_1.2");


        Student student1 = new Student("Popescu I", "popescu@haha.ro");
        Student student2 = new Student("Ionescu E", "ionescu@haha.ro");
        Student student3 = new Student("Vasile I", "vasile@haha.ro");
        Student student4 = new Student("Gica I", "gica@haha.ro");




        info3.addGrupa(grupa_1);
        info3.addGrupa(grupa_2);
        info3.addGrupa(grupa_3);
        grupa_1.addSemigrupa(semigrupa_11);
        grupa_1.addSemigrupa(semigrupa_12);
        semigrupa_11.addStudent(student1);
        semigrupa_11.addStudent(student2);
        semigrupa_12.addStudent(student3);
        semigrupa_12.addStudent(student4);

        info3.print();
    }
}
