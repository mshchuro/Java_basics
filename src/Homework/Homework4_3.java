package Homework;
//Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
//Лифт сломан.
//Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подъеме лифт превысил количество этажей, то считается что лифт поднялся на самый верх.
//Найдите количество подъемов, которые понадобятся лифту.
//Ввод:
//H = 200, N = 50, M = 1
//Ответ: 5
//Объяснение:
//Первый подъем: 50 - 1 = 49
//Второй подъем: 49 + 50 - 1 = 98
//Третий подъем: 98 + 50 - 1 = 147
//Четвертый подъем: 147 + 50 - 1 = 196
//Пятый подъем: выйти за пределы H.
//
//
//Реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)

import java.util.Scanner;

public class Homework4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter floor please:");
        int H = scan.nextInt();

        System.out.println("Enter step up please:");
        int N = scan.nextInt();

        System.out.println("Enter step down please:");
        int M = scan.nextInt();

        System.out.println("Answer is: " + numberOfLifts(H, N, M));
    }

    public static int numberOfLifts(int H, int N, int M){
        int count = 0;
        int floor = 0;

        while (floor < H){

            count++;

            floor += N;
            floor -= M;

            if (H <= N) {
                break;
            }
        }
        return count;
    }
}
