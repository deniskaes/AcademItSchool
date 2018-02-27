package Lesson5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размерность таблицы:");
        int sizeTable = scanner.nextInt();
        String squareMaxNumber = "" + sizeTable * sizeTable;
        int numberSpaces = squareMaxNumber.length();
        String emptinessInArea ="";

        for (int i = 0; i<numberSpaces; i++){
            emptinessInArea += "e";
        }
        String MaxNumber = "" + sizeTable;
        int numberSpacesInHead = MaxNumber.length();
        String emptinessInHead ="";

        for (int i = 0; i<numberSpaces; i++){
            emptinessInHead += "e";
        }

        for (int i = 0; i <= sizeTable; i++) {
            String tableLine = "";
            for (int j = 0; j <= sizeTable; j++) {
                if (i == 0 && j == 0) {
                    tableLine += String.format("%s ", emptinessInHead);
                }
                if (i == 0 && j != 0) {
                    tableLine += String.format("%s%s",emptinessInHead, j);
                }
                if (i != 0 && j == 0) {
                    tableLine += String.format("%s%s|",emptinessInHead, i);
                }
                if (i != 0 && j != 0) {
                    tableLine += String.format("%s", j);
                }
            }
            System.out.println(tableLine);
            if (i == 0) {
                System.out.println("-------------------------");
            }
        }
        System.out.println(emptinessInArea);
    }
}
