package Homework;

import java.util.Arrays;
import java.util.Random;
//Создайте массив из 8 случайных целых чисел из интервала [1;50]
//Выведите массив на консоль в строку.
//Замените каждый элемент с нечетным индексом на ноль.
//Снова выведете массив на консоль в отдельной строке.
public class Homework5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[8];
        int replace = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1, 50);
            if (arr[i] % 2 != 0) {
                arr[i] = replace;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
