package lesson_21_10_2024;

public class lesson_21_10 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 10, 1, 22};
        int key = 9;

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == key) {
//                System.out.println(key + " is on " + i + " pos");
//                break;
//            }
//        }

        int result = searchLinear(arr, key);
        if (result != -1) {
            System.out.println(key + " is on " + result + " position");
        } else {
            System.out.println("Not found");
        }
    }

    public static int searchLinear(int[] arr, int key) {
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

