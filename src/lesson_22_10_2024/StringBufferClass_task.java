package lesson_22_10_2024;

public class StringBufferClass_task {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("It is String Builder Object");
        System.out.println(sb);
        sb.replace(13, 20, "Buffer");
        System.out.println(sb);
    }
}
