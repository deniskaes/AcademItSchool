package Lesson12;

public class UrlParser {

    public static String urlParser(String s) {
        String addressSeparator = "://";
        int startIndex = s.indexOf("://") + addressSeparator.length();
        int endIndex = s.indexOf("/", startIndex);
        String serverName;
        if (endIndex == -1) {
            return serverName = s.substring(startIndex);
        }
        return serverName = s.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        String url = "http://SomeServerName123/dfg/xcv/db/s/";
        System.out.println(urlParser(url));
    }
}
