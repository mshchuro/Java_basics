package lesson_16_10_2024;

import java.util.Arrays;
import java.util.Random;

public class Array_task4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[10];
        int pos = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-20, 20);
            if (arr[i] > 0) {
                pos++;
                sum = sum + arr[i];
            }
        }

        double avg = (double) sum / pos;

        System.out.println(Arrays.toString(arr));
        System.out.println("Positive numbers count: " + pos);
        System.out.println("Sum of positive numbers: " + sum);
        System.out.println("Average: " + avg);
    }
}
