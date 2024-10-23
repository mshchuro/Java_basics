package lesson_16_10_2024;

import java.util.Arrays;
import java.util.Random;

public class Array_task6 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[20];
        int sum = 0;
        boolean foundNegative = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-10, 30);
            if (arr[i] < 0 && !foundNegative) {
                foundNegative = true;
            } else if (foundNegative) {
                sum = sum + arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }
}
