package HomeWorks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class HomeWork17 {
    public static void main(String[] args) {
        StringBuilder Java = new StringBuilder("Java");
        String pattern = "a";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(Java);
        int length = Java.length();
        for (int i = 0; i < Java.length(); i++) {
            if (matcher.find()){
                Java.insert(matcher.end(), "!");
                if (Java.lastIndexOf("a") == length){
                    Java.append("!");
                }
            }
        }
        System.out.println(Java);
    }
}
