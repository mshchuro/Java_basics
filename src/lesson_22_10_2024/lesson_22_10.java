package lesson_22_10_2024;

import java.util.Arrays;

public class lesson_22_10 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println();

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println();

        s3 = s3.intern();
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println();

        char[] strArray = s1.toCharArray();
        System.out.println(Arrays.toString(strArray));
        //char array to string
        String s4 = new String(strArray);
        System.out.println(s4);
    }
}
