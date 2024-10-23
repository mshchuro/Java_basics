package lesson_10_10_2024_for;
//Реализуйте метод который принимает два числа, сравнивает их и возвращает
//сумму всех вхождений в максимальное число.
//Например:
//Вход = 2, 3
//Выход = 6
//Объяснение: 3 больше чем 2, все вхождения 1+2+3 = 6

import java.sql.SQLOutput;
import java.util.Scanner;

public class lesson_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num1");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2");
        int num2 = scanner.nextInt();

        System.out.println(getNum(num1, num2));
    }

    public static int getNum(int num1, int num2) {
        int maxNumber = Math.max(num1, num2);
        int sum = 0;

        for (int i = 0; i <= maxNumber; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
