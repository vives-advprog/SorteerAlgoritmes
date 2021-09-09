package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayUtilsSamenvoegenTest {

    @Test
    public void testSamenvoegenv1(){
        int[] first = ArrayUtils.randomIntArray(10, 50);
        int[] second = ArrayUtils.randomIntArray(20, 150);

        InsertionSorter.sort(first);
        InsertionSorter.sort(second);

        assertThat(ArrayUtils.isSorted(first)).isTrue();
        assertThat(ArrayUtils.isSorted(second)).isTrue();

        int[] result = ArrayUtils.samenvoegen(first, second);
        assertThat(result.length).isEqualTo(30);
        assertThat(ArrayUtils.isSorted(result)).isTrue();
    }

    @Test
    public void testSamenvoegenv2(){
        int[] first = ArrayUtils.randomIntArray(1, 5);
        int[] second = ArrayUtils.randomIntArray(40, 250);

        InsertionSorter.sort(first);
        InsertionSorter.sort(second);

        assertThat(ArrayUtils.isSorted(first)).isTrue();
        assertThat(ArrayUtils.isSorted(second)).isTrue();

        int[] result = ArrayUtils.samenvoegen(first, second);
        assertThat(result.length).isEqualTo(41);
        assertThat(ArrayUtils.isSorted(result)).isTrue();
    }

    @Test
    public void testSamenvoegenv3(){
        int[] first = ArrayUtils.randomIntArray(40, 250);
        int[] second = ArrayUtils.randomIntArray(1, 5);

        InsertionSorter.sort(first);
        InsertionSorter.sort(second);

        assertThat(ArrayUtils.isSorted(first)).isTrue();
        assertThat(ArrayUtils.isSorted(second)).isTrue();

        int[] result = ArrayUtils.samenvoegen(first, second);
        assertThat(result.length).isEqualTo(41);
        assertThat(ArrayUtils.isSorted(result)).isTrue();
    }
}
