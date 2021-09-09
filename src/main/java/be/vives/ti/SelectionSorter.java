package be.vives.ti;

import java.util.Arrays;

public class SelectionSorter {

    public static void main(String[] args) {
        int[] array = ArrayUtils.randomIntArray(50, 200);
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(ArrayUtils.isSorted(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexSmallestValue = findIndexSmallestRemainingValue(array, i);
            ArrayUtils.swap(array, i, indexSmallestValue);
        }
    }

    private static int findIndexSmallestRemainingValue(int[] array, int from) {
        int minIndex = from;
        for (int i = from + 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

}
