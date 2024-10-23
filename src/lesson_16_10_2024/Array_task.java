package lesson_16_10_2024;

import java.util.Arrays;
import java.util.Collections;

public class Array_task {
    public static void main(String[] args) {
        int[] arr = new int[99];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
