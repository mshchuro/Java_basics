package lesson_22_10_2024;

import java.util.Arrays;

public class StringBuilderClass_task2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world!");
        System.out.println(sb);

        sb.insert(6, "beautiful ");
        System.out.println(sb);

        System.out.println("Capacity " + sb.capacity());
        System.out.println("Length " + sb.length());

        char[] chars = new char[sb.length()];
        sb.getChars(0, chars.length, chars, 0);
        System.out.println(Arrays.toString(chars));
    }
}
