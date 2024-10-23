package lesson18_10_2024;

import java.util.Arrays;

public class lesson18_10_task2 {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("StartaUniversity");
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ").append("world!");
        System.out.println(sb);
        sb.insert(6, "beautiful ");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        char [] charMass = new char[sb.length()];
        sb.getChars(0, sb.length(), charMass, 0);
        System.out.println(Arrays.toString(charMass));
    }
}
