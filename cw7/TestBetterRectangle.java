import pl.imiajd.bandzul.BetterRectangle;

public class TestBetterRectangle {
    public static void main(String[] args){
        BetterRectangle rect = new BetterRectangle(1,2,3,4);
        System.out.println("Pole: "+rect.getArea());
        System.out.println("Obwod: "+rect.getPerimeter());
    }
}
