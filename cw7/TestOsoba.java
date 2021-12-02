import pl.imiajd.bandzul.Osoba;
import pl.imiajd.bandzul.Student;
import pl.imiajd.bandzul.Nauczyciel;

public class TestOsoba {
    public static void main(String[] args){
        Osoba os = new Osoba("Kowalski", 1991);
        Student st = new Student("Kowalski2",1992,"politologia");
        Nauczyciel na = new Nauczyciel("Kowalski3",1993,7575);
        System.out.println(os);
        System.out.println(st);
        System.out.println(na);
    }
}
