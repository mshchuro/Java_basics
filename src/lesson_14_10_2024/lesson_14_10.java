package lesson_14_10_2024;

import java.util.Scanner;

public class lesson_14_10 {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Current step (for) - "  + (i + 1));
//        }
//
//        int j = 0;
//        while (j < 10) {
//            System.out.println("Current step (while) - " + (j + 1));
//        }
//
//        int count = 10;
//        getCount(count);
//
//    }
//
//    public static void getCount (int count){
//        int a = 1;
//        while (a <= count) {
//            System.out.println("Привет программист " + a++);
//        }

//        int i = 1;
//        do {
//            System.out.println("i = " + i);
//            i *= 3;
//        } while (i < 10);

//        int i = 0;
//        do{
//            System.out.println("Я в теле DO");
//            i++;
//        } while (i < 3);
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println("Choose any one: ");
//
//        Scanner scanner = new Scanner(System.in);
//        int choice;
//
//        do {
//            System.out.println("Choose your player:");
//            System.out.println("1. Elf");
//            System.out.println("2. Orc");
//            System.out.println("3. Exit");
//
//            System.out.print("Enter your choice: ");
//            choice = scanner.nextInt();
//            if (choice == 1) {
//                System.out.println("You chose: Elf");
//            } else if (choice == 2) {
//                System.out.println();
//                System.out.println("You chose: Orc");
//            }
//        } while (choice != 3);
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println("for");
//        for (int i = 1; i < 10; i++) {
//            for (int j = 2; j < 10; j++) {
//                System.out.println(i + " * " + j + " = " + (i * j) + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("while");
//        int i = 1;
//        while (i < 10) {
//
//            int j = 1;
//            while (j < 10){
//                System.out.println(i + " * " + j + " = " + (i * j));
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//        Реализовать подсчет факториала используя цикл for. Пример вычисления факториала:
//        n! = 1*2*...*n;
//        0! = 1;
//        5! = 1*2*3*4*5;
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println("Factorial of " + input + " is " + getFactorial(input));

    }

    public static int getFactorial(int input){
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}

