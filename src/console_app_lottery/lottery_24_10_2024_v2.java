package console_app_lottery;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class lottery_24_10_2024_v2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Set<Integer> winningNumbers = new HashSet<>();
        Set<Integer> userNumbers = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        // Генерация уникальных выигрышных номеров
        while (winningNumbers.size() < 5) {
            int vinNum = rand.nextInt(1, 51); // Генерация случайного числа от 1 до 50
            winningNumbers.add(vinNum);
        }

        System.out.println("Введите свои числа от 1 до 50:");

        // Ввод уникальных номеров от пользователя
        while (userNumbers.size() < 5) {
            System.out.print("Введите число: ");
            int userNum = sc.nextInt();

            // Проверка на диапазон и уникальность
            if (userNum < 1 || userNum > 50) {
                System.out.println("Ошибка, введите число от 1 до 50.");
            } else if (!userNumbers.add(userNum)) { // Метод add вернет false, если число уже существует
                System.out.println("Ошибка: номер " + userNum + " уже был введен. Пожалуйста, введите другое число.");
            }
        }

        // Вывод выигрышных номеров и номеров пользователя
        System.out.println("Выигрышные номера: " + winningNumbers);
        System.out.println("Ваши номера: " + userNumbers);
    }
}
