package lesson_21_10_2024;

import java.util.Random;

public class lesson_21_10_matrix_task_4 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 2);
                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }
                System.out.println();
        }
    }
}
