package be.vives.ti;

import java.util.Arrays;

public class InsertionSorter {

    public static void main(String[] args) {
        int[] array = ArrayUtils.randomIntArray(50, 200);
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(ArrayUtils.isSorted(array));
    }

    public static void sort(int[] array)
    {
        for (int i = 1; i < array.length; i++) {
            int next = array[i];
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            int j = i;
            while (j > 0 && array[j - 1] > next) {
                ArrayUtils.swap(array, j, j-1);
                j--;
            }
        }
    }
}
