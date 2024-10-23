package lesson_21_10_2024;

import java.util.Arrays;

public class lesson_21_10_task2 {
    public static void main(String[] args) {
        int[] array = {22, 3, 4, 2, 50};
        long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(array)); // not sorted
        System.out.println("Start time " + start);
        array = bubbleSort(array);
        System.out.println(Arrays.toString(array)); // sorted
        System.out.println("All time " + (System.currentTimeMillis() - start));
    }

    public static int[] bubbleSort(int[] array){
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]){
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
        return array;
    }
}
