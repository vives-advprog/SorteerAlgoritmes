package be.vives.ti;

import java.util.Arrays;

public class BogoSorter{

    public static void main(String[] args) {
        int[] array = {2, 15, 3, 6, 12, 5, 7};
        //int[] nietAanTeRadenArray = {2, 15, 3, 6, 12, 5, 7, 4, 9, 11, 1, 12, 15};
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(ArrayUtils.isSorted(array));
    }

    private static void sort(int[] array) {
        int i = 0;
        while (!ArrayUtils.isSorted(array)) {
            ArrayUtils.shuffle(array);
            i++;
        }
        System.out.println("aantal iteraties: " + i);
    }



}
