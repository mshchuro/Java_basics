package Homework;

public class Homework4_1 {
    //Представим, что у нас есть устройство, в котором две колбы.
    //Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
    //Вы должны написать метод, который проверяет это устройство.
    //Ваша программа должна иметь переменные temperature1 и temperature2.
    //В результате метод возвращает true или false.
    public static void main(String[] args) {
        int temperature1 = 200;
        int temperature2 = 80;
        System.out.println(checkTemp(temperature1, temperature2));
    }

    public static boolean checkTemp(int temperature1, int temperature2){

        if (temperature1 > 100 || temperature2 < 100) {
            return true;
        } else {
            return false;
        }
    }
}

Homework4_1
Homework4_2
Homework4_3
