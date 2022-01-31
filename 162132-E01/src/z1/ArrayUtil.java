package z1;

public class ArrayUtil {
    public static <T extends Comparable<T>> boolean jestPalindromem(T[] obj){

        for(int i=0; i<(obj.length-1)/2;i++){
            if(obj[i].compareTo(obj[obj.length-i-1])!=0) return false;
        }
        return true;
    }
}
