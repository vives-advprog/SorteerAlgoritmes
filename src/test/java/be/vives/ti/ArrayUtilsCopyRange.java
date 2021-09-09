package be.vives.ti;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayUtilsCopyRange {

    private int[] array;

    @BeforeEach
    void setUp() {
        array = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    }

    @Test
    void testCopyRangev1() {
        int[] copy = Arrays.copyOfRange(array, 0, 2);
        assertThat(copy.length).isEqualTo(2);
        assertThat(copy).contains(2,4);
    }

    @Test
    void testCopyRangev2() {
        int[] copy = ArrayUtils.copyRange(array, 3, 7);
        assertThat(copy.length).isEqualTo(4);
        assertThat(copy).contains(8,10,12,14);
    }
}
