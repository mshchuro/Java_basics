package lesson_21_10_2024;

import java.util.Random;

public class lesson_21_10_matrix_task {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Random random = new Random();
        int sum = 0;
        int min = matrix[0][0];
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(20);
                System.out.print(matrix[i][j] + " ");
                sum = sum + matrix[i][j];

                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("sum is " + sum);

        double avg = (double) sum / (matrix.length * matrix[0].length);
        System.out.println("avg is " + avg);

        System.out.println("Min is " + min);
        System.out.println("Max is " + max);
    }
}
