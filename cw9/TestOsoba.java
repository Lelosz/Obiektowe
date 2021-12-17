import pl.imiajd.bandzul.Osoba;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestOsoba {
    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<>();
        Osoba o = new Osoba("Kowalski", LocalDate.of(2001,1,1));
        grupa.add(o);
        Osoba o2 = new Osoba("Kowalski", LocalDate.of(2002,2,2));
        grupa.add(o2);
        Osoba o3 = new Osoba("Nowak",LocalDate.of(2003,3,3));
        grupa.add(o3);
        Osoba o4 = new Osoba("Kowalczyk",LocalDate.of(2003,3,3));
        grupa.add(o4);
        Osoba o5 = new Osoba("Bandzul",LocalDate.of(2004,4,4));
        grupa.add(o5);

        for(Osoba os: grupa){
            System.out.println(os);
        }

        System.out.println("\npo sortowaniu:\n");
        grupa.sort(Osoba::compareTo);

        for(Osoba os: grupa){
            System.out.println(os);
        }
    }
}
