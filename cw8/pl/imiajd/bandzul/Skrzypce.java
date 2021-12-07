package pl.imiajd.bandzul;
import java.time.LocalDate;

public class Skrzypce extends Instrument{
    public Skrzypce(String producent, java.time.LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }
    public String dzwiek(){
        return "Dzwiek skrzypiec";
    }
}
