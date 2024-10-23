package lessons;

public class lesson_0910 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0;
        char operator = '/';
        System.out.println(calculate(num1, operator, num2));
    }


    public static int calculate(int num1, char operator, int num2){
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error");
                    System.exit(0);
                } else {
                    return num1 / num2;
                }
            default:
                return 0;
        }
    }
}
