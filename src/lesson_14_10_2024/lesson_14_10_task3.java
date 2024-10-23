package lesson_14_10_2024;

public class lesson_14_10_task3 {
    public static void main(String[] args) {

        int M = 5;
        int N = 8;
        for (int y = 0; y <= M; y++) {
            for (int x = 0; x <= N; x++) {
                if (x == 0 && y <= M || y == 0 && x <= N || y <= M && x == N || y == M && x <= N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
