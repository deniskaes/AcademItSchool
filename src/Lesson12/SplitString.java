package Lesson12;

public class SplitString {

    public static int sumSplitString(String s, String separator) {
        String[] array = s.split(separator);
        int sum = 0;
        for (String e : array) {
            sum += Integer.parseInt(e);
        }
        return sum;
    }

    public static void main(String[] args) {
        String string = "1,2,3,4,5,6,7,8,9";
        System.out.println(sumSplitString(string, ","));
    }
}
