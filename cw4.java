import java.io.File;
import java.io.FileNotFoundException;
import java.lang.String;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.Scanner;

public class cw4 {
    public static void main(String[] args) throws FileNotFoundException
    {
        //zad 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj str: ");
        String str = scanner.nextLine();
        System.out.println("podaj substr :");
        String subStr = scanner.nextLine();
        System.out.println("Liczba wystapien c: "+ countChar(str,'c') );
        System.out.println("Liczba wystapien podnapisu w napisie: " + countSubStr(str,subStr));
        System.out.println("Srodek: "+ middle(str));
        System.out.println("Wynik powtorzenia: "+ repeat(str,3));
        System.out.println("dgasdvbc " +where(str,subStr));
        System.out.println("podaj napis (change): ");
        System.out.println("buffer " + change(str));
        System.out.println("podaj napis (nice): ");
        System.out.println("Nice: "+ nice(str));
        System.out.println("Podaj separator: ");
        char sep = scanner.next().charAt(0);
        System.out.println("Podaj liczbe pozycji dzielacych separatory: ");
        int pos = scanner.nextInt();
        System.out.println("Nice2: "+ nice2(str,sep,pos));
        //zad 2
        System.out.println("podaj znak do zliczenia: ");
        char c = scanner.next().charAt(0);
        String ch1 ="";
        int counter = 0;
        File f1 = new File("filepath\\cw4nap.txt");
        Scanner r1 = new Scanner(f1);
        while(r1.hasNextLine()){
            String data = r1.nextLine();
            ch1 = ch1 +data;
        }
        r1.close();
        for(int i=0;i<ch1.length();i++){
            if(ch1.charAt(i) == c) counter++;
        }
        System.out.println(counter);
        //zad 3
        System.out.println("podaj napis do zliczenia: ");
        String st = scanner.nextLine();
        String ch2 ="";
        int counter2 = 0;
        File f2 = new File("filepath\\cw4nap.txt");
        Scanner r2 = new Scanner(f2);
        while(r2.hasNextLine()){
            String data = r2.nextLine();
            ch2 = ch2 +data;
        }
        r2.close();
        for(int i = 0; i<ch2.length() - st.length() + 1; i++){
            if(ch2.substring(i, i+st.length()).equals(st)) counter2++;
        }
        System.out.println("Wyraz wystapil: "+ counter2+ " razy");
        //zad 4
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n= scanner4.nextInt();
        System.out.println("Polozymy w sumie: " + ileZiaren(n));
        //zad 5
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Czas oszczedzania(lata): ");
        float n2= scanner4.nextFloat();
        System.out.println("Wysokosc stopy procentowej: ");
        float p = scanner5.nextFloat();
        System.out.println("Kapital: ");
        float k = scanner5.nextFloat();
        System.out.println("Twoj kapital wyniesie: "+ kapital(n,k,p));

    }
    //zad 1
    public static int countChar(String str, char c )
    {
        int count = 0;
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i) == c) count++;
        }
        return count;
    }

    public static int countSubStr(String str, String subStr)
    {
        int count = 0;
        count = str.split(subStr, -1).length-1;
        return count;
    }
    public static String middle(String str)
    {
        if(str.length()%2==0)
        {
            return str.substring((str.length()/2-1),str.length()/2+1);
        }
        else
        {
            return String.valueOf(str.charAt(str.length()/2));
        }
    }
    public static String repeat(String str, int n)
    {
        int i=0;
        String re = "";
        while(i<n)
        {
            re+= str;
            i++;
        }
        return re;
    }
    public static int[] where(String str, String subStr)
    {
        int i =0;
        int j =0;
        int[] array = new int[countSubStr(str,subStr)];
        while(str.indexOf(subStr, i) != -1)
        {
            array[j] = str.indexOf(subStr,i);
            i=str.indexOf(subStr,i)+subStr.length();
            j++;
        }
        return array;
    }
    public static String change(String str)
    {
        StringBuffer buffer = new StringBuffer();
        char a;
        for(int i=0;i<str.length();i++){
            a = str.charAt(i);
            if(Character.isUpperCase(a)){
                a=Character.toUpperCase(a);
            }
            else if(Character.isLowerCase(a)){
                a=Character.toUpperCase(a);
            }
            buffer.append(a);
        }
        return buffer.toString();
    }
    public static String nice(String str)
    {
        StringBuffer buffer = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if((str.length()-i)%3==0 && i!=0){
                buffer.append('\'');
            }
            buffer.append(str.charAt(i));
        }
        return buffer.toString();
    }
    public static String nice2(String str,char sep, int pos){
        StringBuffer buffer = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if((str.length()-i)% pos==0 && i!=0){
                buffer.append(sep);
            }
            buffer.append(str.charAt(i));
        }
        return buffer.toString();
    }
    //zad 4
    public static BigInteger ileZiaren(int n){
        int[][] board = new int[n][n];
        BigInteger result = BigInteger.ZERO;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result=result.add(BigInteger.valueOf((long)Math.pow(2,n*i+j)));
            }
        }
        return result;
    }
    //zad 5
    public static BigDecimal kapital(float n, float k, float p){
        BigDecimal result = BigDecimal.valueOf(k);
        result = result.multiply(BigDecimal.valueOf(Math.pow(p+1,n)));
        return result;
    }
}