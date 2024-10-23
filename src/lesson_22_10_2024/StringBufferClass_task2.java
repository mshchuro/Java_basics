package lesson_22_10_2024;

public class StringBufferClass_task2 {
    public static void main(String[] args) {
        concatReversStr("Hello", "world");
    }

    public static void concatReversStr(String str1, String str2){
        String concat = str1 + str2;

        StringBuffer reverse = new StringBuffer(concat).reverse();

        System.out.println("Reversed string - " + reverse);
    }
}
