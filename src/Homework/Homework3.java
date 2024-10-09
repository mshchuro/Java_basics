package Homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first word with even words count : ");
        String word1 = scanner.nextLine();

        System.out.println("Please enter second word with even words count : ");
        String word2 = scanner.nextLine();

        System.out.println(getWordCount(word1, word2));
        System.out.println(changeWord(word1, word2));
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter value in Euro");
        double value = scan.nextInt();

        System.out.println(convertValue(value) + " USD");
    }

//    Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//    Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.

//    Например:
//    ввод - mama, papa
//    вывод - mapa

    public static String getWordCount(String word1, String word2){
        if(word1.length() % 2 == 1 || word2.length() % 2 == 1){
            return "Enter word with even words count";
        } else {
            return "Words accepted";
        }
    }

    public static String changeWord(String word1, String word2){
        String firstHalfWord1 = word1.substring(0, word1.length() / 2);
        String firstHalfWord2 = word2.substring(0, word2.length() / 2);

        return firstHalfWord1 + firstHalfWord2;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    Программа запрашивает у пользователя сумму в Евро для конвертации
//    Реализовать метод, который конвертирует полученную сумму в сумму в долларах США

    public static double convertValue(double value){
        double course = 1.05;
        double finalValue = value * course;
        return finalValue;
    }
}
