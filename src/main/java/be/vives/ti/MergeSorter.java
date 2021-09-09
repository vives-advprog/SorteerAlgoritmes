package be.vives.ti;

import java.util.Arrays;

public class MergeSorter {

    public static void main(String[] args) {
        int[] array = ArrayUtils.randomIntArray(50, 200);
        mergeSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(ArrayUtils.isSorted(array));
    }


    public static void mergeSort(int[] array) {
        if (array.length >= 2) {
            int mid = array.length / 2;

            int[] left = ArrayUtils.copyRange(array, 0, mid);
            int[] right = ArrayUtils.copyRange(array, mid, array.length);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }
    }

    private static void merge(int[] result, int[] first, int[] second) {
        int iFirst = 0;
        int iSecond = 0;
        int iResult = 0;

        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[iResult] = first[iFirst];
                iFirst++;
            } else {
                result[iResult] = second[iSecond];
                iSecond++;
            }
            iResult++;
        }

        while (iFirst < first.length) {
            result[iResult] = first[iFirst];
            iFirst++;
            iResult++;
        }

        while (iSecond < second.length) {
            result[iResult] = second[iSecond];
            iSecond++;
            iResult++;
        }

    }
}
