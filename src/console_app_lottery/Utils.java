package console_app_lottery;

import java.util.Arrays;

public class Utils {
    public static boolean isNumInArray(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int[] guessNumbers(int[] arrWin, int[] arrUser){
        int[] resArr = new int[arrUser.length];
        int resIndex = 0;
        for (int i = 0; i < arrUser.length; i++) {
            if (isNumInArray(arrWin, arrUser[i])){
                resArr[resIndex] = arrUser[i];
                resIndex++;
            }
        }
        int[] result = new int[resIndex];
        for (int i = 0; i < resIndex; i++) {
            result[i] = resArr[i];
        }
        return result;
    }

    public static void lotteryResult(int[] result){
        if (result.length > 0){
            System.out.println("Guessed numbers: " + Arrays.toString(result));
        } else {
            System.out.println("You lose");
        }
    }
}

