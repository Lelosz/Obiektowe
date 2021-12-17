import pl.imiajd.bandzul.Student;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args){
        ArrayList<Student> grupa = new ArrayList<>();
        Student s = new Student("Kowalski", LocalDate.of(2001,1,1), 4.2);
        grupa.add(s);
        Student s2 = new Student("Kowalski", LocalDate.of(2002,2,2),3.3);
        grupa.add(s2);
        Student s3 = new Student("Nowak",LocalDate.of(2003,3,3),2.2);
        grupa.add(s3);
        Student s4 = new Student("Kowalczyk",LocalDate.of(2003,3,3),3.8);
        grupa.add(s4);
        Student s5 = new Student("Bandzul",LocalDate.of(2004,4,4),2.8);
        grupa.add(s5);

        for(Student st: grupa){
            System.out.println(st);
        }

        System.out.println("\npo sortowaniu:\n");
        grupa.sort(Student::compareTo);

        for(Student st: grupa){
            System.out.println(st);
        }
    }
}
