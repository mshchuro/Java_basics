package lesson_16_10_2024;

import java.util.Random;
import java.util.Arrays;

public class Array_task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[15];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10);
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Even count is " + even);
        System.out.println("Odd counr is " + odd);
    }
}
