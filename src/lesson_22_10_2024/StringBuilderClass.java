package lesson_22_10_2024;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Capacity = " + sb.capacity());
        System.out.println("Length = " + sb.length());

        sb.append("I learn Java!!!");
        System.out.println();

        System.out.println("Capacity = " + sb.capacity());
        System.out.println("Length = " + sb.length());
        System.out.println();

        sb.delete(2, 8);
        System.out.println(sb);

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);

        sb.replace(2, 6, "JS");
        System.out.println(sb);

//        sb.reverse();
//        System.out.println(sb);
        // check palindrome
        String str = "1234321";
        StringBuilder sbPalindrome = new StringBuilder(str);
        sbPalindrome.reverse();
        System.out.println(str.equals(sbPalindrome.toString()));

        String subString = sb.substring(2);
        System.out.println(subString);
    }
}
