package z1;

import java.time.LocalTime;

public class ArrayUtilTest {
    public static void main(String[] args){
        Integer[] inttab1 = new Integer[]{1,2,3,2,1};
        Integer[] inttab2 = new Integer[]{1,3,2,5,4};
        LocalTime[] ttab1 = new LocalTime[]{LocalTime.of(20,10,15),LocalTime.of(21,11,16), LocalTime.of(22,12,17)};
        LocalTime[] ttab2 = new LocalTime[]{LocalTime.of(11,11,11),LocalTime.of(21,10,15), LocalTime.of(11,11,11)};
        System.out.println(ArrayUtil.jestPalindromem(inttab1));
        System.out.println(ArrayUtil.jestPalindromem(inttab2));
        System.out.println(ArrayUtil.jestPalindromem(ttab1));
        System.out.println(ArrayUtil.jestPalindromem(ttab2));
    }
}
