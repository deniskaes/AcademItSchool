package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountRepeat {

    public static int countRepeat(String s, String f) {
        int count = 0;
        int startIndex = 0;
        while (s.indexOf(f, startIndex) != -1) {
            count++;
            startIndex = s.indexOf(f, startIndex) + f.length();
        }

        return count;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String findString = "ночь";
        StringBuilder sb = new StringBuilder();
        try (Scanner scanner = new Scanner(new FileInputStream("..\\AcademItSchool\\src\\Lesson12\\input.txt"));) {
            while (scanner.hasNext()) {
                sb.append(scanner.nextLine().toLowerCase());
            }
            System.out.println(countRepeat(sb.toString(), findString));
        }


    }
}
