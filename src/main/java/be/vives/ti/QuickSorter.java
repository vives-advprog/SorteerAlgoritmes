package be.vives.ti;

import java.util.Arrays;

public class QuickSorter {

    public static void main(String[] args) {
        int[] array = ArrayUtils.randomIntArray(50, 200);
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(ArrayUtils.isSorted(array));
    }

    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int array[], int low, int high) {
        if (low < high) {
            int pivotIdx = partition(array, low, high);
            quickSort(array, low, pivotIdx-1);
            quickSort(array, pivotIdx+1, high);
        }
    }

    private static int partition(int array[], int start, int end) {
        int pivot = array[start];
        int m = start;
        for (int k = start+1; k <= end; k++) {
            if (array[k] < pivot) {
                m++;
                ArrayUtils.swap(array, k, m);
            }
            else {
               // optie 1: do nothing
            }
        }
        ArrayUtils.swap(array, start, m);
        return m;
    }

}
