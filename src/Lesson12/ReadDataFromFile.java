package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream(".\\inputData.txt"))) {
            int[] array = new int[10];
            int i = 0;
            while (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
                i++;
            }
        }
    }
}
