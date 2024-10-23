package lesson_10_10_2024_for;

//        1. Реализуйте метод, принимающий в параметре число.
//        2. Распечатайте все входящие значения числа
//        Например:
//        Вход = 8
//        Выход =
//        1
//        2
//        3
//        8

import java.util.Scanner;

public class lesson10102024 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter positive number: ");
        int input = scan.nextInt();

        if (input <= 0){
            System.out.println("Error, try again");
        }

        getNum(input);
    }

    public static void getNum(int input){
        for (int i = 1; i <= input; i++){
            System.out.println(i);
        }
    }
}




