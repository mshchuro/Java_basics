package lesson_09_10_2024;

public class task_0910 {
    public static void main(String[] args) {
        int day = 5;
        String dayName = getDay(day);
        System.out.println(dayName);
    }

    public static String getDay(int day){
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Error";
        }
    }
}
