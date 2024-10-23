package lesson_14_10_2024;

import java.util.Scanner;

public class lesson_14_10_task {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printFibonacci(n);
    }


    public static void printFibonacci(int n) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {

            System.out.print(a + " ");
            int count = a + b;
            a = b;
            b = count;
        }
    }
}
