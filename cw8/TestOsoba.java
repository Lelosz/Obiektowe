import pl.imiajd.bandzul.Osoba;
import pl.imiajd.bandzul.Pracownik;
import pl.imiajd.bandzul.Student;
import java.time.LocalDate;
import java.util.*;


public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];
        String[] imiona1 = {"Jan"};
        String[] imiona2 = {"Malgorzata"};
        ludzie[0] = new Pracownik("Kowalski",imiona1,LocalDate.of(2010,01,01),true, 50000, LocalDate.of(2030,01,01) );
        ludzie[1] = new Student("Nowak",imiona2,LocalDate.of(2011,02,02),false,"informatyka",4.5);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": "+ " Plec: "+p.getPlec() + " Data urodzenia: " + p.getDataUrodzenia() + p.getOpis());
        }
    }
}
