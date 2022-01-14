import java.util.Scanner;

public class SpacedNumbersTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int number = sc.nextInt();
        sc.close();
        SpacedNumbers.spacedNumbers(number);
    }
}
