package lesson_22_10_2024;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите строку");
        String str = scan.nextLine();

        System.out.println("Введите символ");
        char ch = scan.next().charAt(0);

        findCount(str, ch);

    }

    public static void findCount(String str, char ch){
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(count);
    }
}
