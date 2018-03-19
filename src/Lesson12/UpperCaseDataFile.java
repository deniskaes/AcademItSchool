package Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class UpperCaseDataFile {
    public static void main(String[] args) throws FileNotFoundException {
        try(Scanner scanner = new Scanner(new FileInputStream("..\\AcademItSchool\\src\\Lesson12\\input.txt"));
            PrintWriter printWriter = new PrintWriter(new FileOutputStream("..\\AcademItSchool\\src\\Lesson12\\output.txt"))) {
            while(scanner.hasNext()){
                printWriter.println(scanner.nextLine().toUpperCase());
            }
        }
    }
}
