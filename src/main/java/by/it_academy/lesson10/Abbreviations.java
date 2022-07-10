package by.it_academy.lesson10;

import java.util.*;

public class Abbreviations {
    private static final Map<String, String> map = new HashMap<>();


    public void addAbbreviations(String abbreviation, String explanation) {
        map.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviations) {
        return map.containsKey(abbreviations);
    }

    public String findExplanationFor(String abbreviation) {
        return map.get(abbreviation);
    }

    public void printAbbreviations() {
        System.out.println("All abbreviations: ");
        System.out.println(map.keySet());

    }

    public void printAbbreviationsWhere(String text) {
        String[] arrayText = text.split("[ ,.!?]");
        List<String> list = new ArrayList<>(Arrays.asList(arrayText));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            for (int i = 0; i < list.size(); i++) {
                if ((entry.getValue()).toLowerCase().contains(list.get(i).toLowerCase())) {
                    System.out.println(entry.getKey());
                    break;
                }
            }
        }
    }

    public void printExplanationOfAbbreviationsWhere(String text) {
        String[] arrayText = text.split("[ ,.!?]");
        List<String> list = new ArrayList<>(Arrays.asList(arrayText));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            for (int i = 0; i < list.size(); i++) {
                if ((entry.getValue()).toLowerCase().contains(list.get(i).toLowerCase())) {
                    System.out.println(entry.getValue());
                    break;
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
        System.out.println(abbreviation.findExplanationFor("HF"));
        abbreviation.printAbbreviations();
        abbreviation.printAbbreviationsWhere("I have a good day");
        abbreviation.printExplanationOfAbbreviationsWhere("i don't have time");
    }
}
