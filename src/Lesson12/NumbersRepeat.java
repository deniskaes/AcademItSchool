package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumbersRepeat {

    public static int numbersRepeat(String s) {
            int count = 0;


        return 1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String findString = "alphabet";
        StringBuilder sb = new StringBuilder();
        try (Scanner scanner = new Scanner(new FileInputStream("..\\AcademItSchool\\src\\Lesson12\\input.txt"));) {
            while(scanner.hasNext()) {
                sb.append(scanner.nextLine().toLowerCase());
            }
            String result = sb.toString();
        }


    }
}
