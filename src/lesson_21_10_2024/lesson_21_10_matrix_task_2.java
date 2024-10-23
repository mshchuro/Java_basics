package lesson_21_10_2024;

import java.util.Random;

public class lesson_21_10_matrix_task_2 {
    public static void main(String[] args) {
        //1 2 3
        //4 5 6
        //7 8 9

        int[][] matrix = new int[5][5];
        Random random = new Random();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(21);
                System.out.print(matrix[i][j] + " ");

                if (i == j) {
                    sum1 = sum1 + matrix[i][j];
                }

                if (i + j == matrix.length - 1) {
                    sum2 = sum2 + matrix[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
