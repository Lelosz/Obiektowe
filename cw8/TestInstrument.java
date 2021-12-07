import pl.imiajd.bandzul.Instrument;
import pl.imiajd.bandzul.Flet;
import pl.imiajd.bandzul.Fortepian;
import pl.imiajd.bandzul.Skrzypce;

import java.time.LocalDate;

public class TestInstrument {
    public static void main(String[] args){
        Instrument[] orkiestra = new Instrument[5];
        orkiestra[0] = new Flet("Canto", LocalDate.of(2005,1,1));
        orkiestra[1] = new Flet("DRACO", LocalDate.of(2001,2,2));
        orkiestra[2] = new Fortepian("Janulewicz", LocalDate.of(2008,3,3));
        orkiestra[3] = new Fortepian("Bittner & Stütz", LocalDate.of(2015,4,4));
        orkiestra[4] = new Skrzypce("Verona Violin", LocalDate.of(2005,5,5));
        for(Instrument i: orkiestra){
            System.out.println(i.dzwiek());
        }
        for(Instrument i:orkiestra){
            System.out.println(i);
        }
    }
}
