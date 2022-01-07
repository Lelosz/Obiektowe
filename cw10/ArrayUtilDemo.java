import java.time.LocalDate;
import java.util.List;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        Integer[] i = {1, 2, 3, 4, 5};
        Integer[] i2 = {1, 2, 4, 3, 5};
        System.out.println("Posortowane cyfry: " + ArrayUtil.isSorted(i));
        System.out.println("Nieposortowane cyfry: " + ArrayUtil.isSorted(i2));
        LocalDate[] d = {LocalDate.parse("2001-12-02"), LocalDate.parse("2002-12-02"), LocalDate.parse("2003-12-02")};
        LocalDate[] d2 = {LocalDate.parse("2001-12-02"), LocalDate.parse("2000-12-02"), LocalDate.parse("2003-12-02")};
        System.out.println("Posortowane daty: " + ArrayUtil.isSorted(d));
        System.out.println("Nieposortowane daty: " + ArrayUtil.isSorted(d2));


        System.out.println("Czy 5 znajduje sie na liscie :" + ArrayUtil.binSearch(i, 3));
        System.out.println("Czy 6 znajduje sie na liscie :" + ArrayUtil.binSearch(i, 6));
        System.out.println("Czy data 2002-12-02 znajduje sie na liscie :" + ArrayUtil.binSearch(d, LocalDate.parse("2002-12-02")));
        System.out.println("Czy data 2004-12-02 znajduje sie na liscie :" + ArrayUtil.binSearch(d, LocalDate.parse("2004-12-02")));


        System.out.println("Przed posortowaniem: ");
        for (int j = 0; j < i2.length; j++) {
            System.out.println(i2[j]);
        }
        ArrayUtil.selectionSort(i2);
        System.out.println("Po posortowaniem: ");
        for (int j = 0; j < i2.length; j++) {
            System.out.println(i2[j]);
        }


        System.out.println("Przed posortowaniem: ");
        for (int j = 0; j < d2.length; j++) {
            System.out.println(d2[j]);
        }
        ArrayUtil.selectionSort(d2);
        System.out.println("Po posortowaniem: ");
        for (int j = 0; j < d2.length; j++) {
            System.out.println(d2[j]);
        }
    }
}