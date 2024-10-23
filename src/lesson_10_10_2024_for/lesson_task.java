package lesson_10_10_2024_for;

//1. Создайте метод, при вызове которого печатается 5 раз “Hello my friend !”
//2. Создайте метод, который принимает число и выводит в консоль только
//четные вхождения в это число
//Например:
//Вход = 5, выход = 2, 4

public class lesson_task {
    public static void main(String[] args) {
        String result = "Hello my friend !";
        int number1 = 8;
        int number2 = 5;

        getHello(result);
        System.out.println("Method with 'if' ");
        getNumber(number1);
        System.out.println("Method without 'if' ");
        getNum(number2);

    }

    public static void getHello(String result) {
        for (int i = 0; i < 5; i++) {
            System.out.println(result);
        }
    }

    public static void getNumber(int number1){
        for (int i = 1; i <= number1; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void getNum(int number2){
        for (int i = 2; i <= number2; i+= 2){
            System.out.println(i);
        }
    }
}
