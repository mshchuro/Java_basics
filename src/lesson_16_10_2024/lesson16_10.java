package lesson_16_10_2024;

public class lesson16_10 {
    public static void main(String[] args) {
//        //1. init array
//        int[] arr = new int[10];
//        System.out.println(arr.length);
//
//        //2. init array
//        int[] arr2 = {1, 2, 3, 4, 5};
//        System.out.println(arr2.length);
//
//        String[] arr3 = {"Hello", "Java", "JS", "Python"};
//        System.out.println(arr3.length);
//        System.out.println(arr3.length - 1);
//        System.out.println();
//
//        int[] arr4 = new int[10];
//
//        for (int i = 0; i < arr4.length; i++) {
//            arr4[i] = i + 1;
//        }
//
//        for (int j = 0; j < arr4.length; j++) {
//            System.out.println(arr4[j]);
//        }

//        Создайте массив L = 10
//        Инициализируйте массив числами от 1 до 10 используя способ литерала
//        Выведите на консоль элемент из второй ячейки
//        Выведите на консоль элемент из предпоследней ячейки
//        Распечатайте на консоль все элементы из ячеек массива
//        Используйте инструкцию .print()
//        Замените все элементы в данном массиве на значение “-1”
//        Распечатайте на консоль все элементы из ячеек массива
//        Используйте инструкцию .print()

        int[] arr = new int[10];
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(arr2[1]);
        System.out.println(arr2.length - 1);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println();

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
////////////////////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
