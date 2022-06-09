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
        boolean timeCheck = false;
        while (matcher.find()) {
            int time_divide = 0;
            matcher.group();
            time_divide += Integer.parseInt(matcher.group());
            i++;
            if (i == 1) {
                hh = time_divide;
                if (0 <= hh & hh < 24) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                    break;
                }
            }
            if (i == 2) {
                mm = time_divide;
                if (0 <= mm & mm < 60) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                    break;
                }
            }
            if (i == 3) {
                ss = time_divide;
                if (0 <= ss & ss < 60) {
                    System.out.println("true");
                    System.out.println(hh + ":" + mm + ":" + ss);
                } else {
                    System.out.println("false");
                    break;
                }
            }
        }
        return timeCheck ;
    }


    public static void main(String[] args) {
        Checker checker = new Checker();
        checker.timeOfDay("12:43:31");
    }
}
