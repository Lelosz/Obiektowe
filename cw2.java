import java.util.Scanner;
public class cw2 {
    public static void main(String[] args){
        //zad 1
        //1.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("a)podaj n:");
        int n = keyboard.nextInt();
        double suma = 0;
        //a
        while(n>0){
            System.out.println("podaj liczbe:");
            suma = suma + keyboard.nextInt();
            n = n - 1;
        }
        System.out.println(suma);
        //b
        suma = 1;
        System.out.println("b)podaj n:");
        n = keyboard.nextInt();
        while(n>0){
            System.out.println("podaj liczbe:");
            suma = suma * keyboard.nextInt();
            n = n -1;
        }
        System.out.println(suma);
        //c
        suma = 0;
        System.out.println("c)podaj n:");
        n = keyboard.nextInt();
        while(n>0){
            System.out.println("podaj liczbe:");
            suma = suma + Math.abs(keyboard.nextInt());
            n = n - 1;
        }
        System.out.println(suma);
        //d
        suma = 0;
        System.out.println("d)podaj n:");
        n = keyboard.nextInt();
        while(n>0) {
            System.out.println("podaj liczbe:");
            suma = suma + Math.sqrt(Math.abs(keyboard.nextInt()));
            n = n - 1;
        }
        System.out.println(suma);
        //e
        suma = 1;
        System.out.println("e)podaj n:");
        n = keyboard.nextInt();
        while(n>0) {
            System.out.println("podaj liczbe:");
            suma = suma * Math.abs(keyboard.nextInt());
            n = n - 1;
        }
        System.out.println(suma);
        //f
        suma = 0;
        System.out.println("f)podaj n:");
        n = keyboard.nextInt();
        while(n>0) {
            System.out.println("podaj liczbe:");
            suma = suma + Math.pow(keyboard.nextInt(),2);
            n = n - 1;
        }
        System.out.println(suma);
        //g
        suma = 0;
        int suma2 = 1;
        System.out.println("g)podaj n:");
        n = keyboard.nextInt();
        int n2=n;
        while(n>0) {
            System.out.println("podaj liczbe:");
            suma = suma +keyboard.nextInt();
            n = n - 1;
        }
        while(n2>0){
            System.out.println("podaj druga liczbe:");
            suma2 = suma2 * keyboard.nextInt();
            n2 = n2 - 1;
        }
        System.out.println(suma + suma2);
        //h
        suma = 0;
        System.out.println("h)podaj n:");
        n = keyboard.nextInt();
        while(n>0) {
            System.out.println("podaj liczbe:");
            suma = suma + Math.pow(-1,n+1) * keyboard.nextInt();
            n = n - 1;
        }
        System.out.println(suma);
        //i
        suma = 0;
        System.out.println("i)podaj n:");
        n = keyboard.nextInt();
        int silnia = 1;
        while(n>0) {
            for(int i =n; i>0; i--)
            {
                silnia = silnia * i;
            }
            System.out.println("podaj liczbe:");
            suma = suma + Math.pow(-1,n) * keyboard.nextInt()/ silnia;
            n = n - 1;
        }
        System.out.println(suma);
        //2.
        System.out.println("2. Podaj n:");
        n = keyboard.nextInt();
        int[] tablica = new int[n];
        for(int j = 0;j<n;j++)
        {
            tablica[j] = keyboard.nextInt();
        }
        if(n<2) System.out.println(tablica[0]);
        for(int i = 1;i<=n;i++)
        {
            if(i<=n-1) System.out.println(tablica[i]);
            else System.out.println(tablica[0]);
        }
        //Zad2
        //2.2
        System.out.println("2.2. Podaj n:");
        n = keyboard.nextInt();
        suma = 0;
        float[] poil = new float[n];
        for(int j=0;j<n;j++)
        {
            poil[j] = keyboard.nextFloat();
        }
        for(int i=0;i<n;i++)
        {
            if (poil[i]>0) {suma = suma + 2*poil[i];}
        }
        System.out.println(suma);
        //zad2.3
        System.out.println("2.3. Podaj n:");
        n = keyboard.nextInt();
        int id=0;
        int in=0;
        int iu=0;
        int[] dnu = new int[n];
        for(int j=0;j<n;j++)
        {
            dnu[j] = keyboard.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(dnu[i]>0) id++;
            else if(dnu[i]==0) in++;
            else iu++;
        }
        System.out.println(id);
        System.out.println(in);
        System.out.println(iu);
        //zad2.4
        System.out.println("2.4. Podaj n:");
        n = keyboard.nextInt();
        float najm;
        float najw;
        float[] nin = new float[n];
        for(int j=0;j<n;j++)
        {
            nin[j] = keyboard.nextFloat();
        }
        najw = nin[0];
        najm = nin[0];
        for(int i=0;i<n;i++)
        {
            if(nin[i]<najm) {najm = nin[i];}
        }
        for(int i=0;i<n;i++)
        {
            if(nin[i]>najw) {najw = nin[i];}
        }
        System.out.println(najw);
        System.out.println(najm);
        //zad2.5
        System.out.println("2.5. Podaj n:");
        n = keyboard.nextInt();
        int obok = 0;
        int[] sasi = new int[n];
        for(int j=0;j<n;j++)
        {
            sasi[j] = keyboard.nextInt();
        }
        for(int i=0;i+1<n;i++)
        {
            if(sasi[i]>0 && sasi[i+1]>0) {obok++;}
        }
        System.out.println(obok);
    }
}