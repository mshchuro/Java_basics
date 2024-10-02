package Homework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
//        Создайте строку через new - I study Basic Java!
//        Распечатать пред-последний символ строки. Используем метод String.charAt().
//        Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//        Вырезать строку Java c помощью метода String.substring().
//        Заменить все символы “а” на “о”.
//        Преобразуйте строку к верхнему регистру.
//        Преобразуйте строку к нижнему регистру.

        String text = "I study Basic Java!";

        System.out.println(text.charAt(text.length() -2 ));
        System.out.println(text.contains("Java"));
        System.out.println(text.substring(14, 18));
        System.out.println(text.replace("a", "o"));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Создайте методы с математическими операциями +, -, *, /
//        Каждый метод принимает два числа в параметрах и возвращает результат
//        Вызовите все методы в main
//        Результат распечатайте в консоль

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first num please");
        int a = scan.nextInt();
        System.out.println("Enter second num please");
        int b = scan.nextInt();

        getSum(a, b);
        getSubtraction(a, b);
        getMultiplication(a, b);
        getDivision(a, b);
    }

        public static void getSum(int a, int b){
            int sum = a + b;
            System.out.println(sum);
        }

        public static void getSubtraction(int a, int b){
            int minus = a - b;
            System.out.println(minus);
        }

        public static void getMultiplication(int a, int b){
            int mult = a * b;
            System.out.println(mult);
        }

        public static void getDivision(int a, int b){
            double divide = (double) a / b;
            System.out.println(divide);
        }
}
