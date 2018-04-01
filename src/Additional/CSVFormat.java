package Additional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSVFormat {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("inputCSV.csv"));
             PrintWriter printWriter = new PrintWriter("output.html")) {
            boolean isTableRowOpen = false;

            StringBuilder sb = new StringBuilder();
            sb.append("<table>");

            while (scanner.hasNextLine()) {
                boolean isTableDetailOpen = false;
                boolean isDoubleQuotesOpen = false;
                boolean isSeenIncludesQuotes = false;
                boolean isSeenComma = false;

                String readLine = scanner.nextLine();
                char[] lineToParse = readLine.toCharArray();

                if (!isTableRowOpen) {
                    sb.append("<tr>");
                }

                for (int i = 0; i < lineToParse.length; ++i) {
                    if (lineToParse[i] == ',') {
                        if (i == 0 || (isSeenComma && !isTableDetailOpen)) {
                            sb.append("<td></td>");
                            isSeenComma = true;

                            if (i == lineToParse.length - 1) {
                                sb.append("<td></td>");
                            }
                        } else if (isDoubleQuotesOpen && !isSeenIncludesQuotes) {
                            sb.append(',');
                            isSeenComma = false;
                        } else if (isDoubleQuotesOpen) {
                            sb.append("</td>");
                            isSeenComma = true;
                            isDoubleQuotesOpen = false;
                            isTableDetailOpen = false;
                            isSeenIncludesQuotes = false;
                        } else if (isTableDetailOpen) {
                            isSeenComma = true;
                            isTableDetailOpen = false;
                            sb.append("</td>");
                            if (i == lineToParse.length - 1) {
                                sb.append("<td></td>");
                            }
                        }
                    } else if (lineToParse[i] == '"') {
                        if (!isTableDetailOpen) {
                            isTableDetailOpen = true;
                            isDoubleQuotesOpen = true;
                            sb.append("<td>");
                        } else if (isDoubleQuotesOpen && !isSeenIncludesQuotes) {
                            isSeenIncludesQuotes = true;

                            if (i == lineToParse.length - 1) {
                                sb.append("</td>");
                            }
                        } else if (isDoubleQuotesOpen) {
                            sb.append('"');
                            isSeenIncludesQuotes = false;
                        }
                    } else if (lineToParse[i] != ',' && lineToParse[i] != '"') {
                        if (isTableRowOpen && !isTableDetailOpen) {
                            isTableRowOpen = false;
                            isTableDetailOpen = true;
                            isDoubleQuotesOpen = true;
                            sb.append(lineToParse[i]);

                        } else if (!isTableDetailOpen) {
                            isTableDetailOpen = true;
                            sb.append("<td>");
                            sb.append(lineToParse[i]);

                            if (i == lineToParse.length - 1) {
                                sb.append("</td>");
                            }
                        } else if (i != lineToParse.length - 1) {
                            sb.append(lineToParse[i]);
                        } else if (isDoubleQuotesOpen) {
                            isTableRowOpen = true;
                            sb.append(lineToParse[i]);
                            sb.append("<br/>");
                        }
                    }
                }
                if (!isTableRowOpen) {
                    sb.append("</tr>");
                }
            }
            sb.append("</table>");
            printWriter.print(sb.toString());
        }
    }
}
