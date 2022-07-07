package by.it_academy.lesson10;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Abbreviations {
    private static final Map<String, String> map = new HashMap<>();


    public void addAbbreviations(String abbreviation, String explanation) {
        map.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviations) {
        for (String check : map.keySet()) {
            if (map.containsKey(abbreviations)) {
                return true;
            }
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        for (String check : map.keySet()) {
            if (map.containsKey(abbreviation)) {
                return map.get(abbreviation);
            }
        }
        return "";
    }

    public void printAbbreviations() {
        System.out.println("All abbreviations: ");
        System.out.println(map.keySet());

    }

    public void printAbbreviationsWhere(String text) {
        String[] arrayText = text.split(" ");
        List<String> list = new LinkedList<>(Arrays.asList(arrayText));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String check = entry.getValue();
            String[] checkValue = check.split(" ");
            for (int i = 0; i < checkValue.length; i++) {
                if (list.contains(checkValue[i])) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }

    public void printExplanationOfAbbreviationsWhere(String text) {
        String[] arrayText = text.split(" ");
        List<String> list = new LinkedList<>(Arrays.asList(arrayText));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String check = entry.getValue();
            String[] checkValue = check.split(" ");
            for (int i = 0; i < checkValue.length; i++) {
                if (list.contains(checkValue[i])) {
                    System.out.println(entry.getValue());
                }
            }
        }
    }


    public static void main(String[] args) {
        Abbreviations abbreviation = new Abbreviations();
        map.put("NP", "No problem");
        map.put("GL", "Good luck");
        map.put("MB", "My bad");
        System.out.println(map.entrySet());
        abbreviation.addAbbreviations("HF", "Have fun");
        System.out.println(map.entrySet());
        System.out.println(abbreviation.hasAbbreviation("GL"));
        System.out.println(abbreviation.findExplanationFor("MB"));
        abbreviation.printAbbreviations();
        abbreviation.printAbbreviationsWhere("I Have a Good day");
        abbreviation.printExplanationOfAbbreviationsWhere("I don't Have a car");
    }
}
