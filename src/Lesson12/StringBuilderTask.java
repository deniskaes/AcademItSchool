package Lesson12;

public class StringBuilderTask {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < 100; i++) {
            stringBuilder.append(i).append(", ");
        }
        stringBuilder.append(100);
        System.out.println(stringBuilder.toString());
    }
}
