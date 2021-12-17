package pl.imiajd.bandzul;
import pl.imiajd.bandzul.Osoba;
import java.time.LocalDate;

public class Student extends Osoba{
    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen){
        super(nazwisko,dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }
    public int compareTo(Student o) {
        if(super.compareTo(o) <0){
            return -1;
        }
        else if(super.compareTo(o) >0){
            return 1;
        }
        else{
            return Double.compare(this.sredniaOcen,o.sredniaOcen);
        }
    }
    public String toString(){
        return "Student [" + this.getNazwisko() +"] ["+this.getDataUrodzenia() + "] ["+ this.sredniaOcen +"]";
    }
}
