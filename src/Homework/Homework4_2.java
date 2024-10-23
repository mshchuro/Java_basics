package Homework;
//У вас на банковском счету N долларов.
//Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
//Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
//Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
public class Homework4_2 {
    public static void main(String[] args) {
        int N = 21;

        System.out.println(getDays(N));
    }

    public static int getDays(int N) {
        int days = 0;

        while (N > 1) {
            for (int i = N / 2; i >= 1; i--) {
                if (N % i == 0) {
                    N -= i;
                    days++;
                    break;
                }
            }
        }
        days++;
        return days;
    }
}
