package Homework;

import java.util.Arrays;

//Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n . Найдите недостающий элемент.
//
//
//input:
//arr[] = {1,2,3,5}
//out: 4
//
//
//arr[] = {6,1,2,8,3,4,7,10,5}
//out: 9
public class Homework_6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        Arrays.sort(arr);

        int sum = 0;
        for (int i = 0; i <= arr[arr.length -1]; i++) {
            sum += i;
        }

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr [i];
        }
        System.out.println(sum - result);
    }
}
