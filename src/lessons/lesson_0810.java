package lessons;

import java.util.Scanner;

public class lesson_0810 {
    public static void main(String[] args) {

//        if(methodOne() && methodTwo()) {
//            System.out.println("Hello from if");
//        }
//
//    }
//
//    // () & () & () - будет проверено каждое выражение
//    // () && () && () - если в левой части false, то правая часть уже не проверяется
//
//    public static boolean methodOne() {
//        System.out.println("Hello from method one");
//        return false;
//    }
//
//    public static boolean methodTwo() {
//        System.out.println("Hello from method two");
//        return true;
//    }

//        int a = 15;

//        if (a > 15) {
//            System.out.println("a greater than 15");
//        } else {
//            System.out.println("a smaller than 15");
//        }

//        if (a > 15) {
//            System.out.println("a greater than 15");
//        } else if (a < 15){
//            System.out.println("a smaller than 15");
//        } else {
//            System.out.println("a is = 15");
//        }

        //nested - if
//        String text = "Hello";
//
//        if(text != null) {
//            if(text.length() == 5){
//                System.out.println("We have correct text");
//            }
//        } else {
//            System.out.println("Sorry text is null");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input number 1 - 4: ");
//        int data = scanner.nextInt();
//
//        if(data == 1) {
//            System.out.println("Your input one");
//        } else if (data == 2) {
//            System.out.println("Your input two");
//        } else if (data == 3) {
//            System.out.println("Your input three");
//        } else if (data == 4){
//            System.out.println("Your input four");
//        } else {
//            System.out.println("Incorrect data");
//        }

        //Создайте две переменные *isWeekend* и *isRain*.
        //Создайте переменную *canWalk*, значение которой должно быть истинным, если это выходной день (isWeekend = true) и не идет дождь (isRain = false).
        //Создайте метод, который принимает два параметра и возвращает значение true/false
        //Результат сохраните в canWalk
        //Распечатайте в консоль.

        boolean isWeekend1 = true;
        boolean isRain1 = false;

        boolean isWeekend2 = false;
        boolean isRain2 = false;

        boolean canWalk = getWalk(isWeekend1, isRain1);
        boolean canWalk2 = getWalk(isWeekend2, isRain2);

        if (canWalk){
            System.out.println("We can walk today");
        } else {
            System.out.println("We cant walk today");
        }

        if (canWalk2){
            System.out.println("We can walk today");
        } else {
            System.out.println("We cant walk today");
        }
    }


        private static boolean getWalk(boolean isWeekend, boolean isRain){
            if(isWeekend && !isRain){
                return true;
            } else {
                return false;
            }
        }
}
