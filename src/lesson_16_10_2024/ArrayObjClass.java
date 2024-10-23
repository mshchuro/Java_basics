package lesson_16_10_2024;

public class ArrayObjClass {
    public static void main(String[] args) {
        Student[] studentsArray = new Student[10];
        for (int i = 0; i < studentsArray.length; i++) {
            System.out.print(studentsArray[i] + " ");
        }

        System.out.println();

        Student[] strudentsLiteral = new Student[]{
                new Student("Alex"),
                new Student("Max"),
                new Student("Bob"),
                new Student("Misha")
        };
        for (int i = 0; i < strudentsLiteral.length; i++) {
            System.out.print(strudentsLiteral[i] + " ");
        }
    }
}
