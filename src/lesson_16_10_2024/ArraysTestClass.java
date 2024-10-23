package lesson_16_10_2024;

import java.util.Arrays;

public class ArraysTestClass {
    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3, 4, 5, 6, 7};
        int[] arrayCopy = Arrays.copyOf(arrayOne, 3);

        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayCopy));

        int[] arrayRange = Arrays.copyOfRange(arrayOne, 2, 5);
        System.out.println(Arrays.toString(arrayRange));

        int[] arrSort = {5, 3, 1, 19, 0};
        Arrays.sort(arrSort);
        System.out.println(Arrays.toString(arrSort));

    }
}
