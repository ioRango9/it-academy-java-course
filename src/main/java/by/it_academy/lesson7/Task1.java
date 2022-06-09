package by.it_academy.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String[] myData = new String[]{"Igor, 1997", "Sebastian, 2001", "Christopher, 2004", "Demetrius, 1968"};
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Pattern pattern1 = Pattern.compile("\\d+");
        String text = "";
        double averageDuring = 0;
        int j = 0;
        for (int i = 0; i < myData.length; i++) {
            Matcher matcher = pattern.matcher(myData[i]);
            matcher.find();
            matcher.group();
            if (matcher.group().length() > text.length()) {
                text = matcher.group();
            }
            Matcher matcher1 = pattern1.matcher(myData[i]);
            matcher1.find();
            matcher1.group();
            averageDuring += Integer.parseInt(matcher1.group());
            j++;
        }
        System.out.println(text);
        System.out.println(averageDuring / j);
    }
}
