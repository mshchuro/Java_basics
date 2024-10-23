package lesson_09_10_2024;

public class lesson_0910_ternary {
    public static void main(String[] args) {
        int day = 1;

        String dayName;
        if (day == 1){
            System.out.println("Do smth");
            dayName = "Monday";
        } else {
            dayName = "Tuesday";
        }

        String dayName2 = (day == 1) ? "Monday" : "Tuesday";
        System.out.println(dayName2);
    }
}
