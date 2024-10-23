package lesson_14_10_2024;

import java.util.Scanner;

public class lesson_14_10_task2 {
    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        int one = m.nextInt();
        int two = n.nextInt();


        getStars(one , two);
    }

    public static void getStars(int one, int two){
        for (int a = 0; a < one; a++) {
            for (int b = 0; b < two; b++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}


