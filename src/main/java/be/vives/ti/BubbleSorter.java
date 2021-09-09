package be.vives.ti;

import java.util.Arrays;

public class BubbleSorter {

    public static void main(String[] args) {
        int[] array = ArrayUtils.randomIntArray(50, 200);
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(ArrayUtils.isSorted(array));
    }

    public static void sort(int[] array)
    {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    ArrayUtils.swap(array, i, i + 1);
                }
            }
        }
    }

    public static void optimizedSort(int[] array)
    {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            // Assume the array is sorted before the inner loop
            boolean isSorted = true;
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    ArrayUtils.swap(array, i, i + 1);
                    // Any swapping will invalidate the assumption
                    isSorted = false;
                }
            }
            // if flag is still true after inner loop -> sorted
            if(isSorted){
                return;
            }
        }
    }
}
