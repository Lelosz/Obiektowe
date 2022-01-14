import java.util.LinkedList;
import java.util.List;


public class ReduceTest {
    public static void main(String[] args){
        LinkedList<String> pracownicy = new LinkedList<>();
        pracownicy.add("1");
        pracownicy.add("2");
        pracownicy.add("3");
        pracownicy.add("4");
        pracownicy.add("5");
        pracownicy.add("6");
        System.out.println("1 "+pracownicy.contains("1"));
        System.out.println("2 "+pracownicy.contains("2"));
        System.out.println("3 "+pracownicy.contains("3"));
        System.out.println("4 "+pracownicy.contains("4"));
        System.out.println("5 "+pracownicy.contains("5"));
        System.out.println("6 "+pracownicy.contains("6")+"\n");
        Reduce obj = new Reduce<>(pracownicy);
        obj.redukuj(pracownicy,0);
        System.out.println("1 "+pracownicy.contains("1"));
        System.out.println("2 "+pracownicy.contains("2"));
        System.out.println("3 "+pracownicy.contains("3"));
        System.out.println("4 "+pracownicy.contains("4"));
        System.out.println("6 "+pracownicy.contains("6")+"\n");

    }
}
