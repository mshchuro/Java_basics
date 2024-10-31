package console_app_lottery;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public void run(){
        Random rand = new Random();

        int[] arrWin = new int[Const.SIZE];
        int[] arrUser = new int[Const.SIZE];
//        int vin1 = 0;
//        int vin2 = 0;
//        int vin3 = 0;
//        int vin4 = 0;
//        int vin5 = 0;
//        int userNum1 = 0;
//        int userNum2 = 0;
//        int userNum3 = 0;
//        int userNum4 = 0;
//        int userNum5 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers between 1 and 50 ");
        int userNum;
        int res = 0;

        while (res < Const.SIZE) {
            System.out.println("Enter number " + (res + 1));
            userNum = sc.nextInt();

            if (userNum <= 50 && userNum >= 1 && !Utils.isNumInArray(arrUser, userNum)) {
                arrUser[res] = userNum;
                res++;
            } else {
                System.out.println("Error");
            }
        }
//            switch (res) {
//                case 1:
//                    if (userNum <= 50 && userNum >= 1) {
//                        userNum1 = userNum;
//                        res++;
//                    }else {
//                        System.out.println("Номер больше 50. ВВедите ещё раз");
//                    }
//                    break;
//                case 2:
//                    if (userNum <= 50 && userNum >= 1 && userNum1 != userNum) {
//                        userNum2 = userNum;
//                        res++;
//                    } else {
//                        System.out.println("Номер больше 50. ВВедите ещё раз");
//                    }
//                    break;
//                case 3:
//                    if (userNum <= 50 && userNum >= 1 && userNum1 != userNum && userNum2 != userNum) {
//                        userNum3 = userNum;
//                        res++;
//                    } else {
//                        System.out.println("Номер больше 50. ВВедите ещё раз");
//                    }
//                    break;
//                case 4:
//                    if (userNum <= 50 && userNum >= 1 && userNum1 != userNum && userNum2 != userNum && userNum3 != userNum) {
//                        userNum4 = userNum;
//                        res++;
//                    } else {
//                        System.out.println("Номер больше 50. ВВедите ещё раз");
//                    }
//                    break;
//                case 5:
//                    if (userNum <= 50 && userNum >= 1 && userNum1 != userNum && userNum2 != userNum && userNum3 != userNum && userNum4 != userNum) {
//                        userNum5 = userNum;
//                        res++;
//                    } else {
//                        System.out.println("Номер больше 50. ВВедите ещё раз");
//                    }
//                    break;


//        int sizeVin = 5;
        int vinNum;
        int resVin = 0;

        while (resVin < Const.SIZE) {
            vinNum = rand.nextInt(1, 51);
            if (!Utils.isNumInArray(arrWin, vinNum)) {
                arrWin[resVin] = vinNum;
                resVin++;
            }
        }
//            switch (resVin) {
//                case 1:
//                    vin1 = vinNum;
//                    resVin++;
//                    break;
//                case 2:
//                    if (vinNum != vin1) {
//                        vin2 = vinNum;
//                        resVin++;
//                    }
//                    break;
//                case 3:
//                    if (vinNum != vin1 && vinNum != vin2) {
//                        vin3 = vinNum;
//                        resVin++;
//                    }
//                    break;
//                case 4:
//                    if (vinNum != vin1 && vinNum != vin2 && vinNum != vin3) {
//                        vin4 = vinNum;
//                        resVin++;
//                    }
//                    break;
//                case 5:
//                    if (vinNum != vin1 && vinNum != vin2 && vinNum != vin3 && vinNum != vin4) {
//                        vin5 = vinNum;
//                        resVin++;
//                    }
//                    break;
//            }
//        }
//        System.out.println("Выигранные номера : " + vin1 + " " + vin2 + " " + vin3 + " " + vin4 + " " + vin5);
//        System.out.println("Ваши номера : " + userNum1 + " " + userNum2 + " " + userNum3 + " " + userNum4 + " " + userNum5 + " ");
        System.out.println("Your numbers: " + Arrays.toString(arrUser));
        System.out.println("Winner numbers: " + Arrays.toString(arrWin));
        Utils.lotteryResult(Utils.guessNumbers(arrUser, arrWin));
    }
}
