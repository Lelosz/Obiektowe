package pl.imiajd.bandzul;
import java.time.LocalDate;

public class Flet extends Instrument {
    public Flet(String producent, java.time.LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }
    public String dzwiek(){
        return "Dzwiek fletu";
    }
}
