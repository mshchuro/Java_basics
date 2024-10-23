package lesson_21_10_2024;

import java.util.Arrays;
import java.util.Random;

public class lesson_21_10_bubble {
    public static void main(String[] args) {

        int[] arr = new int[6];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10);
        }

        System.out.println(Arrays.toString(arr)); // not sorted
        arr = sortBubble(arr);
        System.out.println(Arrays.toString(arr)); // sorted
    }

    public static int[] sortBubble(int[] arr){
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }
}
