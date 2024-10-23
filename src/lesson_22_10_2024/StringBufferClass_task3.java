package lesson_22_10_2024;

public class StringBufferClass_task3 {
    public static void main(String[] args) {
        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                sb.append("e");
            } else {
                sb.append(arr[i]);
            }
        }

        System.out.println(sb);
    }
}
