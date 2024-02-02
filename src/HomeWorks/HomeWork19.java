package HomeWorks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork19 {
    public static void main(String[] args) {
        String Database = "+7 499 456-45-78, +74994564578, 7 (499) 456 45 78, 7 (499) 456-45-78";
        String pattern = "(\\+7\\s\\d\\d\\d\\s\\d\\d\\d-\\d\\d-\\d\\d|" +
                "\\+7\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d|" +
                "7\\s\\(\\d\\d\\d\\)\\s\\d\\d\\d\\s\\d\\d\\s\\d\\d|" +
                "7\\s\\(\\d\\d\\d\\)\\s\\d\\d\\d-\\d\\d-\\d\\d)";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(Database);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
