package by.it_academy.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String[] dataNamesAndDob = new String[]{"Igor, 1997", "Sebastian, 2001", "Christopher, 2004", "Demetrius, 1968"};
        Pattern patternSymbols = Pattern.compile("\\b\\w+\\b");
        Pattern patternNumbers = Pattern.compile("\\d+");
        String longestName = "";
        double averageYearOfBirth = 0;
        for(int i = 0; i < dataNamesAndDob.length; i++) {
            Matcher matcherNames = patternSymbols.matcher(dataNamesAndDob[i]);
            matcherNames.find();
            if (matcherNames.group().length() > longestName.length()) {
                longestName = matcherNames.group();
            }
            Matcher matcherDob = patternNumbers.matcher(dataNamesAndDob[i]);
            matcherDob.find();
            averageYearOfBirth += Integer.parseInt(matcherDob.group());
        }
        System.out.println(longestName);
        System.out.println(averageYearOfBirth / dataNamesAndDob.length);
    }
}
