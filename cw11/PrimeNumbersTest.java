import java.util.Scanner;

public class PrimeNumbersTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = sc.nextInt();
        sc.close();
        PrimeNumbers.primeNumbers(n);
    }
}
