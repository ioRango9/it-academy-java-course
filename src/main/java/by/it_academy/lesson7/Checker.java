package by.it_academy.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {

    public boolean timeOfDay(String str) {
        int hh = 0;
        int mm = 0;
        int ss = 0;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find()) {
            int timeDivide = 0;
            matcher.group();
            timeDivide += Integer.parseInt(matcher.group());
            i++;
            if (i == 1) {
                hh = timeDivide;
            }
            if (i == 2) {
                mm = timeDivide;
            }
            if (i == 3) {
                ss = timeDivide;
            }
        }
        return (hh >= 0 & hh < 24 & mm >= 0 & mm < 60 & ss >= 0 & ss < 60);
    }

    public static void main(String[] args) {
        Checker checkerTest = new Checker();
        System.out.println(checkerTest.timeOfDay("23:25:58"));
    }
}