package lesson18_10_2024;

public class lesson18_10_task {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";

        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

    }
}