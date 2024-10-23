package lesson_11_10_2024;

import java.util.Scanner;

public class lesson_11_10 {
    public static void main(String[] args) {
//        Integer[] test1 = {1, 2, 3, 4, 5};
//        String[] test2 = {"hi", "my", "name", "is", "max"};
//
//        System.out.println(test1[0]);
//        System.out.println(test2[0]);
 //////////////////////////////////////////////////////////////////////////////////////
        Integer[] test4 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (Integer elem : test4){
            if (elem % 2 == 0){
                sum = sum + elem;
            }
        }
        System.out.println("sum = " + sum);
///////////////////////////////////////////////////////////////////////////////////////
//        Integer[] test3 = new Integer[10];
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < test3.length; i++) {
//            System.out.println("Enter value for i " + i + ":");
//            test3[i] = scanner.nextInt();
//        }
//
//        System.out.println("Created array: ");
//        for (int i = 0; i < test3.length; i++) {
//            System.out.print(test3[i] + " ");
        }
    }
