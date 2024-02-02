package HomeWorks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork18 {
    public static void main(String[] args) {
        String Word = "my-p@ssw0rd";
        int a = Word.length();
        String pattern = "[\\w-@\\d]{6,18}";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(Word);
        while (matcher.find()){
            System.out.print(matcher.group());
        }
    }
}
