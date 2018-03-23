package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountRepeat {

    public static int countRepeat(String textSearch, String word) {
        int count = 0;
        int startIndex = 0;
        int newIndex;
        int wordLength = word.length();
        textSearch = textSearch.toLowerCase();

        while ((newIndex = textSearch.indexOf(word, startIndex)) != -1 && startIndex < textSearch.length()) {
            count++;
            startIndex = newIndex + wordLength;
        }
        return count;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String findString = "ночь";
        StringBuilder sb = new StringBuilder();

        try (Scanner scanner = new Scanner(new FileInputStream("..\\AcademItSchool\\src\\Lesson12\\input.txt"));) {
            while (scanner.hasNext()) {
                sb.append(scanner.nextLine());
            }
            System.out.println(countRepeat(sb.toString(), findString));
        }


    }
}
