public class PairUtil {
    public static <T,V> Pair<T,V> swap(Pair<T,V> pair){
        return new Pair<T,V>(pair.getOb1(),pair.getOb2());
    }
}
