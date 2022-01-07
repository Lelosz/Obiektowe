public class ArrayUtil{

    public static <T extends Comparable<T>> boolean isSorted(T[] arr){
        for(int i=0;i<arr.length-1;i++){
            if((arr[i].compareTo(arr[i+1])>0)) return false;
        }
        return true;
    }

    public static <T extends Comparable<T>> int binSearch(T[] tab,T s){
        for(int i=0;i<tab.length;i++){
            if(tab[i].compareTo(s)>0) return i;
        }
        return -1;
    }

    public static <T extends Comparable<T>> void selectionSort(T[] arr){
        int min;
        for(int i=0;i<arr.length-1;i++){
            min = i;
            for(int j=i+1;j<arr.length;j++){
                if((arr[j].compareTo(arr[min])<0)) min=j;
            }
            if(min != i){
                T temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
