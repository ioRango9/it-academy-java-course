package by.it_academy.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {

    public boolean timeOfDay(String str) {
        int hh = 0;
        int mm = 0;
        int ss = 0;
        Checker checker = new Checker();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find()) {
            int time_divide = 0;
            matcher.group();
            time_divide += Integer.parseInt(matcher.group());
            i++;
            if (i == 1) {
                hh = time_divide;
            }
            if (i == 2) {
                mm = time_divide;
            }
            if (i == 3) {
                ss = time_divide;
            }
        }
        return (hh >= 0 & hh < 24 & mm >= 0 & mm < 60 & ss >= 0 & ss < 60);
    }

    public static void main(String[] args) {
        Checker checkerTest = new Checker();
        System.out.println(checkerTest.timeOfDay("23:25:58"));
    }
}