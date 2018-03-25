package Lesson12;

public class UrlParser {

    public static String urlParser(String s) {
        String addressSeparator = "://";
        int startIndex = s.indexOf(addressSeparator) + addressSeparator.length();
        int endIndex = s.indexOf("/", startIndex);

        if (endIndex == -1) {
            return s.substring(startIndex);
        }
        return s.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        String url = "http://SomeServerName123/dfg/xcv/db/s/";
        System.out.println(urlParser(url));
    }
}
