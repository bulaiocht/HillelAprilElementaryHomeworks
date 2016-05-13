package arrays.block.two;

import java.util.Random;

/**
 * Created by Vitalii Kocherga on 18.04.2016.
 */
public class ArrayCalcModel {

    /**
     * Creating array of integers
     *
     * @param size of array
     * @return created array of specific size
     */
    public int[] arrayCreator(int size) {
        return new int[size];
    }

    /**
     * @param emptyArr
     * @param lowBound
     * @param topBound
     * @return
     */
    public int[] arrayRandomizer(int[] emptyArr, int lowBound, int topBound) {
        Random rand = new Random();
        for (int element : emptyArr) {
            element = rand.nextInt(topBound - lowBound) + lowBound;
        }
        return emptyArr;
    }

    /**
     * Calculates sum of array elements
     *
     * @return int sum
     */
    public int elemSum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum = sum + elem;
        }
        return sum;
    }

    /**
     * Finds index of maximal element in array
     *
     * @param array
     * @return index of maximal element in array
     */
    public int maxFinder(int[] array) {
        int index = 0;
        int maxElem = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElem) {
                index = i;
            }
        }
        return index;
    }


}
