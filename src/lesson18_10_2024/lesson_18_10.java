package lesson18_10_2024;

import java.util.Arrays;

public class lesson_18_10 {
    public static void main(String[] args) {
        int[] mass = {1, 2, 27, 3, 0, 2};
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length - 1; j++) {
                if ( mass[j] > mass[j + 1]) {
                    int temp = mass[j];
                    mass[j] = mass[j+1];
                    mass[j+1] = temp;
                }
            }
        }
        System.out.println("mass = " + Arrays.toString(mass));
    }
}
