package be.vives.ti;

import java.util.Arrays;

public class BogoSorter{

    public static void main(String[] args) {
        int[] array = ArrayUtils.randomIntArray(7,50);
        //int[] nietAanTeRadenArray = ArrayUtils.randomIntArray(13,50);
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
