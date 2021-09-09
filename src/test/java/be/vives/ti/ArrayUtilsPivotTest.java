package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayUtilsPivotTest {

    @Test
    void pivot_singleelement() {
        int[] array = {8};
        executePivotAndCheck(array);
    }

    @Test
    void pivot_2elements() {
        int[] array = {8,1};
        executePivotAndCheck(array);
    }

    @Test
    void pivot_inorder() {
        int[] array = {1,2,3,4};
        executePivotAndCheck(array);
    }

    @Test
    void pivot_reverse_order() {
        int[] array = {4,3,2,1};
        executePivotAndCheck(array);
    }

    @Test
    void pivot_random() {
        int[] array = ArrayUtils.randomIntArray(10000,1000);
        array[0] = 4;
        executePivotAndCheck(array);
    }

    private void executePivotAndCheck(int[] array) {
        int pivotValue = getPivotValue(array);
        ArrayUtils.pivot(array);
        int pivotIndex = getPivotIndex(array, pivotValue);
        checkPivot(array, pivotValue, pivotIndex);
    }

    private int getPivotIndex(int[] array, int pivotValue) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == pivotValue){
                return i;
            }
        }
        return -1;
    }

    private int getPivotValue(int[] array) {
        return array[0];
    }

    private void checkPivot(int[] array, int pivotValue, int pivotIndex){
        for (int i = 0; i < pivotIndex; i++) {
            assertThat(array[i] < pivotValue).isTrue();
        }
        for (int i = pivotIndex; i < array.length; i++) {
            assertThat(array[i] >= pivotValue).isTrue();
        }
    }


}