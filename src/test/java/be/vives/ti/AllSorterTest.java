package be.vives.ti;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AllSorterTest {

    private int[] array;

    @BeforeEach
    void setUp() {
        array = ArrayUtils.randomIntArray(1000, Integer.MAX_VALUE);
        assertArrayIsNotSorted();
    }

    @Test
    void testSelectionSorter() {
        SelectionSorter.sort(array);
        assertArrayIsSorted();
    }

    @Test
    void testBubbleSorter() {
        BubbleSorter.sort(array);
        assertArrayIsSorted();
    }

    @Test
    void testBubbleSorterOptimized() {
        BubbleSorter.optimizedSort(array);
        assertArrayIsSorted();
    }

    @Test
    void testInsertionSorter() {
        InsertionSorter.sort(array);
        assertArrayIsSorted();
    }

    @Test
    void testQuickSorter() {
        QuickSorter.sort(array);
        assertArrayIsSorted();
    }

    @Test
    void testMergeSorter() {
        MergeSorter.mergeSort(array);
        assertArrayIsSorted();
    }

    private void assertArrayIsNotSorted() {
        assertThat(ArrayUtils.isSorted(array)).isFalse();
    }

    private void assertArrayIsSorted() {
        assertThat(ArrayUtils.isSorted(array)).isTrue();
    }
}