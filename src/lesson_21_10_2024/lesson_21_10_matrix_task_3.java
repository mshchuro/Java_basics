package lesson_21_10_2024;

import java.util.Random;

public class lesson_21_10_matrix_task_3 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Random random = new Random();
        int pos = 0;
        int neg = 0;
        int zero = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(-5, 5);
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] > 0) {
                    pos++;
                } else if (matrix[i][j] < 0) {
                neg++;
                } else {
                zero++;
                }
            }
                System.out.println();
        }
        System.out.println("negative " + pos);
        System.out.println("positive " + neg);
        System.out.println("zero " + zero);
    }
}
