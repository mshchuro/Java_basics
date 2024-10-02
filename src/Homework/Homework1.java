package Homework;

public class Homework1 {
    public static void main(String[] args) {
//        1. В методе main инициализировать все примитивные типы и не примитивные типы.
//        Вывести их результат в консоль:
//        char: G
//        int: 89
//        byte: 4
//        short: 56
//        float: 4.7333436
//        double: 4.355453532
//        long: 12121
//
//        Character: G
//        Integer: 89
//        Byte: 4
//        Short: 56
//        Float: 4.7333436
//        Double: 4.355453532
//        Long: 12121

        char a = 'G';
        int b = 89;
        byte c = 4;
        short d = 56;
        float e = 4.7333436F;
        double f = 4.355453532;
        long g = 12121;

        System.out.println("Character: " + a);
        System.out.println("Integer: " + b);
        System.out.println("Byte: " + c);
        System.out.println("Short: " + d);
        System.out.println("Float: " + e);
        System.out.println("Double: " + f);
        System.out.println("Long: " + g);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Дано трехзначное число. Вывести на экран все цифры этого числа
//        Пример: 345
//        Вывод в консоль: Число 345 -> 3, 4, 5
        int number = 345;
        int three = number / 100;
        int four = (number / 10) % 10;
        int five = number % 10;

        System.out.println("Число 345 -> " + three + "," + four+ "," + five);
    }
}
