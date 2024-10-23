package lesson_10_10_2024_for;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Задание 3:
// 1. Получите от пользователя Строку.
//2. Напечатайте все буквы из строки, игнорируйте знаки препинания ?, !, ., ,’ и пробел
//3. Для решения используйте цикл и charAt() метод
//Например:
//Вход = “I don’t like rain !”
//выход = I,d,o,n,t,l,i,k,e,r,a,i,n
public class lesson_task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter smth");
        String input = scan.nextLine();

        getText(input);
    }

    public static void getText(String input){

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.' || input.charAt(i) == '?' || input.charAt(i) == '!'){
                continue;
            } else {
                System.out.print(input.charAt(i));
            }
        }
    }
}

//        Задание 3:
//        1. Получите от пользователя Строку.
//        2. Напечатайте все буквы из строки, игнорируйте знаки препинания ?, !, ., ,’ и пробел
//        3. Для решения используйте цикл и charAt() метод
//        Например:
//        Вход = “I don’t like rain !”
//        выход = I,d,o,n,t,l,i,k,e,r,a,i,n
//
//        Задание 4:
//        В диапазоне от 0 до 100  вывести на экран первые 25 чётных чисел, исключая “десятки”.
//
//        Задание 5:
//        Вывести на экран “равнобедренный треугольник”, все “рёбра” которого состоят из единиц, “медиана” равна целому числу n, а вся “площадь” заполнена нулями =)
//        пример: n = 5
//        1
//        11
//        101
//        1001
//        10001
//        1001
//        101
//        11
//        1
