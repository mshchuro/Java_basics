package Homework;

import java.util.Arrays;
import java.util.Random;

//Создайте массив из 5 случайных целых чисел из интервала [10;99]
//Выведите его на консоль в строку.
//Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
public class Homework5_1 {
    public static void main(String[] args) {
        boolean increase = true;
        int[] arr = new int[5];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10, 99);
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]){
                increase = false;
                break;
            }
        }

        if (increase){
            System.out.println("Array increasing");
        } else {
            System.out.println("Array not increasing");
        }

        System.out.println(Arrays.toString(arr));
    }
}
