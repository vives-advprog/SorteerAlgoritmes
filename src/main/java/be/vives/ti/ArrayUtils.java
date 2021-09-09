package be.vives.ti;

import java.util.Arrays;

public class ArrayUtils {

    /**
     * controleert of de meegegeven array gesorteerd is
     * @param array: een al dan niet gesorteerde array van integers
     * @return true als array gesorteerd is en false als deze niet gesorteerd is
     */
    protected static boolean isSorted(int[] array) {
        // TODO oefening 18.1
        return false;
    }

    /**
     * retourneert een array van random integers tussen 0 en maxValue
     * @param length: de lengte van de array, het aantal elementen die de array moet bevatten
     * @param maxValue: de maximum waarde van een integer in de array
     * @return een array van random gegenereerde integers
     */
    public static int[] randomIntArray(int length, int maxValue) {
        // TODO oefening 18.2
        return new int[]{1,4,2,6,7};
    }

    /**
     * methode die 2 elementen in een array, op basis van hun index, omwisselt
     * @param array: de array van integer waarin de swap moet gebeuren,
     * @param i: de index van het eerste element
     * @param j: de index van het tweede element
     */
    public static void swap(int[] array, int i, int j) {
        // TODO oefening 18.3

    }

    /**
     * shuffle alle elementen in de array
     * @param array: de array van integers die geshuffled wordt
     */
    public static void shuffle(int[] array) {
        // TODO oefening 18.4

    }

    /**
     * Het eerste element in de array wordt de pivot
     * Alle elementen kleiner dan de pivot komen links van de pivot te staan
     * Alle elementen groter of gelijk aan de pivot komen rechts van de pivot te staan
     *
     * @param array: de array die volgens een pivot element gesorteerd word
     */
    protected static void pivot(int[] array){
        // TODO oefening 19
    }

    /**
     * methode voegt 2 gesorteerde arrays samen tot 1 gesorteerde array
     * @param first: een eerste gesorteerde array van integers
     * @param second: een tweede gesorteerde array van integers
     * @return: retourneert een gesorteerde array van integers die alle elementen uit first en second bevat
     */
    protected static int[] samenvoegen(int[] first, int[] second) {
        // TODO oefening 20
        return first;
    }

    /**
     * Copies the specified range of the specified array into a new array
     * @param array: the array from which a range is to be copied
     * @param start: the initial index of the range to be copied, inclusive
     * @param end: the final index of the range to be copied, exclusive
     * @return: a new array containing the specified range from the original array, truncated or padded with zeros to obtain the required length
     */
    protected static int[] copyRange(int[] array, int start, int end){
        // TODO: oefening 21
        return Arrays.copyOfRange(array, start, end);
    }
}
