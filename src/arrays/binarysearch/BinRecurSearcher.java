package arrays.binarysearch;

import java.util.Arrays;

/**
 * Class is made for searching the elements inside arrays
 * Created by Kocherga Vitalii on 18.05.2016
 */
class BinRecurSearcher {

    private int[] arrayForProcessing;
    private boolean found;

    /**
     * Basic constructor
     *
     * @param array of integers
     */
    BinRecurSearcher(int[] array) {
        this.arrayForProcessing = arraySorter(array);
    }

    /**
     * @param number to find in array
     * @return true if number has been found successfully or false if not
     */
    boolean find(int number) {
        int head = arrayForProcessing.length - 1;
        int tail = 0;
        found = false;
        binSearch(arrayForProcessing, head, tail, number);
        return found;
    }

    /**
     * Method is looking for number in array using binary search algorithm
     *
     * @param sortedArray is previously sorted array of integers
     * @param head        last element of array or of array's segment
     * @param tail        first element of array or of array's segment
     * @param num         the integer number to search inside array
     */
    private void binSearch(int[] sortedArray, int head, int tail, int num) {
        int middle = (head + tail) / 2;
        if (middle == 0 || head - tail == 1) {
            found = false;
            return;
        }
        if (num == sortedArray[middle]) {
            found = true;
            return;
        }

        if (num == sortedArray[head] || num == sortedArray[tail]) {
            found = true;
            return;
        }
        if (num < sortedArray[middle] && num > sortedArray[tail]) {
            head = middle;
            binSearch(sortedArray, head, tail, num);

        } else if (num > sortedArray[middle] && num < sortedArray[head]) {
            tail = middle;
            binSearch(sortedArray, head, tail, num);
        } else {
            found = false;
        }
    }

    /**
     * Method is making the clone of the original array and sorting the elements of cloned array
     *
     * @param array source array of integers
     * @return new sorted array of integers
     */
    private int[] arraySorter(int[] array) {
        int[] newArray = array.clone();
        Arrays.sort(newArray);
        return newArray;
    }
}