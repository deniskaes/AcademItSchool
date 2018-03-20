package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) throws FileNotFoundException {
        String[] array = new String[10];
        try (Scanner scanner = new Scanner(new FileInputStream("..\\AcademItSchool\\src\\Lesson12\\input.txt"))) {
            int i = 0;
            while (scanner.hasNext()) {
                array[i] = scanner.nextLine();
                i++;
            }
        }
        for (String e : array) {
            System.out.println(e);
        }
    }
}
