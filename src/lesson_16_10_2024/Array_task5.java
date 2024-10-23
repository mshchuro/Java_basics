package lesson_16_10_2024;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter a number");
        int input = scan.nextInt();
        int[] arr = new int[100];
        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
            if (input == arr[i]) {
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
