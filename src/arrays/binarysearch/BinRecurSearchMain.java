package arrays.binarysearch;

/**
 * Class with main method
 * Created by Kocherga Vitalii on 18.05.2016.
 */
public class BinRecurSearchMain {
    public static void main(String[] args) {
        int[] array = {17, 0, 6, 8, 11, 24, 3, 9, 5};
        BinRecurSearcher searcher = new BinRecurSearcher(array);
        boolean find = searcher.find(2);
        System.out.println(find);
    }
}