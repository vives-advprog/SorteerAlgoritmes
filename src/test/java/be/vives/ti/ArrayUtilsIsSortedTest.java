package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayUtilsIsSortedTest {

    @Test
    void isSorted_nullArray() {
        assertThat(ArrayUtils.isSorted(null)).isFalse();
    }

    @Test
    void isSorted_emptyArray_zero_element() {
        assertThat(ArrayUtils.isSorted(new int[0])).isTrue();
    }

    @Test
    void isSorted_emptyArray() {
        assertThat(ArrayUtils.isSorted(new int[10])).isTrue();
    }

    @Test
    void isSorted() {
        int[] array = {1,2,3,4,5,6,7,8};
        assertThat(ArrayUtils.isSorted(array)).isTrue();
    }

    @Test
    void isNotSorted() {
        int[] array = {3,2,1,4,5,6,7,8};
        assertThat(ArrayUtils.isSorted(array)).isFalse();
    }
}