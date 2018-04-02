package Additional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSVFormatNew {

    private static String changeInvalidCharacters(char ch) {
        if (ch == '<') {
            return "&lt";
        } else if (ch == '>') {
            return "&gt";
        } else if (ch == '&') {
            return "&amp";
        } else {
            return "" + ch;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream(args[0]));
             PrintWriter pw = new PrintWriter(args[1])) {

            StringBuilder sb = new StringBuilder();
            boolean inCell = false;

            sb.append("<!DOCTYPE html>").append(System.lineSeparator()).append("<html>").append(System.lineSeparator())
                    .append("<body>").append(System.lineSeparator()).append("<table border = \"1\">").append(System.lineSeparator());

            while (scanner.hasNextLine()) {
                String lineToParse = scanner.nextLine();

                for (int i = 0; i < lineToParse.length(); ++i) {
                    if (inCell) {
                        if (lineToParse.charAt(i) == ',') {
                            sb.append(lineToParse.charAt(i));
                        } else if (lineToParse.charAt(i) == '"') {
                            if (i == lineToParse.length() - 1) {
                                sb.append("</td>").append(System.lineSeparator())
                                        .append("</tr>").append(System.lineSeparator());
                            }
                            inCell = false;
                        } else {
                            if (i == lineToParse.length() - 1) {
                                sb.append("<br/>");
                            }
                            sb.append(changeInvalidCharacters(lineToParse.charAt(i)));
                        }
                    } else {
                        if (lineToParse.charAt(i) == ',') {
                            if (i == 0) {
                                sb.append("<tr>").append(System.lineSeparator()).append("<td></td>")
                                        .append(System.lineSeparator()).append("<td>");
                            } else if (i == lineToParse.length() - 1) {
                                sb.append("</td>").append(System.lineSeparator()).append("<td></td>")
                                        .append(System.lineSeparator()).append("</tr>").append(System.lineSeparator());
                            } else {
                                sb.append("</td>").append(System.lineSeparator()).append("<td>");
                            }
                        } else if (lineToParse.charAt(i) == '"') {
                            if (i == 0) {
                                sb.append("<tr>").append(System.lineSeparator()).append("<td>");
                            }
                            inCell = true;
                        } else {
                            if (i == 0) {
                                sb.append("<tr>").append(System.lineSeparator()).append("<td>");
                            } else if (i == lineToParse.length() - 1) {
                                sb.append(changeInvalidCharacters(lineToParse.charAt(i)));
                                sb.append("</td>").append(System.lineSeparator()).append("</tr>")
                                        .append(System.lineSeparator());
                            } else {
                                sb.append(changeInvalidCharacters(lineToParse.charAt(i)));
                            }
                        }
                    }
                }
            }
            sb.append("</table>").append(System.lineSeparator()).append("</body>")
                    .append(System.lineSeparator()).append("</html>");
            pw.print(sb.toString());
        }
    }
}
