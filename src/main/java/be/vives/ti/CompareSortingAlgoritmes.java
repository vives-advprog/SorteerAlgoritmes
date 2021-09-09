package be.vives.ti;

import java.util.Arrays;

public class CompareSortingAlgoritmes {

    private static String[] algoritmes = {"selection","insertion", "bubble", "merge", "quick"};
    private static int[] experimentLengths = {10,100,1000,10000,100000,200000,500000,1000000};
    private static long[][] results;

    public static void main(String[] args) {
        results = new long[algoritmes.length][experimentLengths.length];

        for (int i = 0; i < experimentLengths.length; i++) {
            int experimentLength = experimentLengths[i];
            System.out.println("Sorteer met " + experimentLength + " elementen");
            int[] startingArray = createStartArrayForExperiment(experimentLength);

            for (int j = 0; j < algoritmes.length; j++) {
                long time = sorteer(startingArray, j);
                saveResultTime(j, i, time);
                System.out.println("klaar met sorteren van " + experimentLength + " elementen met "+algoritmes[j]+" sort in " + time + "ms");
            }
        }

        printCsvHeader();
        printCsvBody(results);
    }

    private static void saveResultTime(int row, int col, long time) {
        results[row][col] = time;
    }

    private static long sorteer(int[] startingArray, int j) {
        int[] toSort = Arrays.copyOf(startingArray, startingArray.length);

        long start = System.currentTimeMillis();

        switch (algoritmes[j]) {
            case "selection":
                SelectionSorter.sort(toSort);
                break;
            case "bubble":
                BubbleSorter.sort(toSort);
                break;
            case "insertion":
                InsertionSorter.sort(toSort);
                break;
            case "quick":
                QuickSorter.sort(toSort);
                break;
            case "merge":
                MergeSorter.mergeSort(toSort);
                break;
            default:
                throw new IllegalArgumentException("Ongeldig sorteeralgoritme");
        }

        long end = System.currentTimeMillis();
        return end-start;
    }

    private static int[] createStartArrayForExperiment(int experimentLength) {
        return ArrayUtils.randomIntArray(experimentLength, experimentLength * 10);
    }

    private static void printCsvHeader() {
        System.out.println();
        System.out.println("-----------------");
        System.out.println();
        String header = ",";
        for (int experimentLength : experimentLengths) {
            header+=experimentLength+",";
        }
        System.out.println(header);
    }

    private static void printCsvBody(long[][] results) {
        for (int i = 0; i < results.length; i++) {
            String result = algoritmes[i]+",";
            for(int j = 0; j< results[i].length; j++){
                result += results[i][j] + ",";
            }
            System.out.println(result);
        }
    }

}
