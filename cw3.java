import java.util.Random;
import java.util.Scanner;

public class cw3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("podaj liczbe calkowita 1<=n<=100:");
        int n = scan.nextInt();
        while (n < 0 | n > 100) {
            System.out.println("podaj n jeszcze raz");
            n = scan.nextInt();
        }
        int[] a = new int[n];
        generuj(a);
        System.out.print("a: ");
        wypisz(a);
        System.out.println("liczb nieparzystych jest: " + ileNieparzystych(a));
        System.out.println("liczb parzystych jest: " + ileParzystych(a));
        System.out.println("liczb dodatnich jest: " + ileDodatnich(a));
        System.out.println("liczb ujemnych jest: " + ileUjemnych(a));
        System.out.println("liczb zerowych jest:" + ileZerowych(a));
        System.out.println("liczb maksymalnych jest: " + ileMaksymalnych(a));
        System.out.println("suma liczb dodatnich wynosi:" + sumaDodatnich(a));
        System.out.println("suma liczb ujemnych wynosi:" + sumaUjemnych(a));
        System.out.println("dlugosc maksymalnego ciagu liczb dodatnich wynosi: " + dlugoscMaksymalnegoCiaguDodatnich(a));
        //signum(a);
        odwrocFragment(a,scan.nextInt(),scan.nextInt());
        //3
        System.out.println("podaj m, n i k");
        int m =scan.nextInt();
        while (m<0 | m>11)
        {
            System.out.println("podaj m jescze raz");
            m = scan.nextInt();
        }
        n =scan.nextInt();
        while (n<0 | n>11)
        {
            System.out.println("podaj n jescze raz");
            n = scan.nextInt();
        }
        int k =scan.nextInt();
        while (k<0 | k>11)
        {
            System.out.println("podaj k jescze raz");
            k = scan.nextInt();
        }
        int[][] b = new int[m][n];
        generuj2(b,m,n);
        System.out.println("Macierz A:");
        wypisz2(b,m,n);
        int[][] c = new int[n][k];
        generuj2(c,n,k);
        System.out.println("Macierz B:");
        wypisz2(c,n,k);
        iloczynMacierzy(b,c,m,k);
    }

    public static void generuj(int[] tab) {
        Random r = new Random();
        for (int j = 0; j < tab.length; ++j) {
            tab[j] = r.nextInt(999 - -999) + -999;
        }
    }

    public static void generuj2(int[][] tab,int i,int j) {
        Random r = new Random();
        for (int d=0; d<i;d++) {
            for(int k =0; k<j;k++)
            {
                tab[d][k] = r.nextInt(999 - -999) + -999;
            }
        }
    }

    public static void wypisz(int[] tab) {
        for (int el : tab) {
            System.out.print(el + " ");
        }
        System.out.println("");
    }
    public static void wypisz2(int[][] tab, int i, int j) {
        for (int d=0;d<i;d++) {
            for(int k=0;k<j;k++)
            {
                System.out.print(tab[d][k] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    //a
    public static int ileNieparzystych(int[] tab) {
        int licznik = 0;
        for (int el : tab) {
            if (el % 2 != 0) licznik++;
        }
        return licznik;
    }

    public static int ileParzystych(int[] tab) {
        int licznik = 0;
        for (int el : tab) {
            if (el % 2 == 0) licznik++;
        }
        return licznik;
    }

    //b
    public static int ileDodatnich(int[] tab) {
        int licznik = 0;
        for (int el : tab) {
            if (el > 0) licznik++;
        }
        return licznik;
    }

    public static int ileUjemnych(int[] tab) {
        int licznik = 0;
        for (int el : tab) {
            if (el < 0) licznik++;
        }
        return licznik;
    }

    public static int ileZerowych(int[] tab) {
        int licznik = 0;
        for (int el : tab) {
            if (el == 0) licznik++;
        }
        return licznik;
    }

    //c
    public static int ileMaksymalnych(int[] tab) {
        int licznik = 1;
        int temp = tab[0];
        for (int el : tab) {
            if(temp<el) {
                temp = el;
                licznik = 1;
            }
            else if(el==temp) {
                licznik++;
            }
        }
        return licznik;
    }

    //d
    public static int sumaDodatnich(int[] tab) {
        int licznik = 0;
        for (int el : tab) {
            if (el > 0) {
                licznik = licznik + el;
            }
        }
        return licznik;
    }

    public static int sumaUjemnych(int[] tab) {
        int licznik = 0;
        for (int el : tab) {
            if (el < 0) {
                licznik = licznik + el;
            }
        }
        return licznik;
    }
    //e
    public static int dlugoscMaksymalnegoCiaguDodatnich(int[] tab)
    {
        int licznik = 0;
        int przechowywalnia = 0;
        for(int j = 0; j<tab.length; j++)
        {
            if(tab[j]>0)
            {
                licznik++;
            }
            else
            {
                if(przechowywalnia<licznik)
                {
                    przechowywalnia = licznik;;
                }
                licznik = 0;
            }
        }
        return przechowywalnia;
    }
    //f
    public static void signum(int[] tab)
    {
        for(int j=0; j<tab.length;j++)
        {
            if(tab[j]>0)
            {
                tab[j]=1;
            }
            else if(tab[j]==0)
            {
                tab[j]=0;
            }
            else
            {
                tab[j]=-1;
            }
        }
        wypisz(tab);
    }
    //g
    public static void odwrocFragment(int[] tab, int lewy, int prawy)
    {
        int[] b = new int[tab.length];
        for(int d=0;d<tab.length;d++)
        {
            b[d]=tab[d];
        }
        for(int i=lewy-1; i<prawy-1;i++)
        {
            tab[i]=b[prawy+lewy-i];
        }
        wypisz(tab);
    }
    //3
    public static void iloczynMacierzy(int[][] t1, int[][] t2, int m, int k)
    {
        int wynik;
        int[][] t3 = new int[m][k];
        for(int i =0;i<m;i++)
        {
            for(int j=0;j<k;j++)
            {
                wynik=0;
                for(int z=0; z<m;z++)
                {
                    wynik+=t1[i][z]*t2[z][j];
                    t3[i][j] = wynik;
                }
            }
        }
        System.out.println("Macierz C:");
        wypisz2(t3,m,k);
    }
}