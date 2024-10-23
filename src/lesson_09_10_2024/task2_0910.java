package lesson_09_10_2024;
        //Самостоятельно:
        //        1. Создайте switch-блок, который мог бы определить, является ли
        //переданный день выходным или рабочим днем.
        //        2. Создайте переменные int day; String dayString;
        //3. Используйте объединение для несколько случаев без операторов break
        //        4. Реализуйте тот же процесс используя if-else блоки
        //5. Реализуйте тот же процесс используя тернарное выражение
        //6. Сравните решения


public class task2_0910 {
    public static void main(String[] args) {
        int day1 = 6;
        int day2 = 1;
        int day3 = 8;

        String dayString = getDay1(day1);
        System.out.println(dayString);

        String dayString2 = getDay2(day2);
        System.out.println(dayString2);

        String dayString3 = getDay3(day3);
        System.out.println(dayString3);


    }

    public static String getDay1(int day){
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return "working day";
            case 6:
                return "weekend";
            case 7:
                return "weekend";
            default:
                return "invalid day";
        }
    }

    public static String getDay2(int day){
            if (day < 6) {
                return "working day";
            } else if (day >= 6){
                return "weekend";
            } else {
                return "error";
            }
    }
    
    public static String getDay3(int day){
        return (day >= 1 && day <= 6) ? "working day" : (day == 6 || day == 7) ? "weekend" : "invalid day";
    }

}
