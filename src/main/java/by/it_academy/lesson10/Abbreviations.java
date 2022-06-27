package by.it_academy.lesson10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Abbreviations {
//    private String abbreviation;
//    private String explanation;


    public void addAbbreviations(String abbreviation, String explanation, Map<String, String> map) {
        map.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviations, Map<String, String> map) {
        for (String check : map.keySet()) {
            if (abbreviations.equals(check)) {
                return true;
            }
        }
        return false;
    }

    public String findExplanationFor(String abbreviation, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet())
            if (entry.getKey().equals(abbreviation)) {
                return entry.getValue();
            }
        return "";
    }

    public void printAbbreviations(Map map) {
        System.out.println("All abbreviations = " + map.keySet());
    }

    public void printAbbreviationsWhere(String text, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(text)) {
                System.out.println(entry.getKey());
            }
        }
    }

    public void printExplanationOfAbbreviationsWhere(String text) {
        // По условию не понял, как метод должен работать
    }


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Abbreviations AAndE = new Abbreviations();
        map.put("NP", "No problem");
        map.put("GL", "Good luck");
        map.put("MB", "My bad");
        System.out.println(map.entrySet());
        AAndE.addAbbreviations("HF", "Have fun", map);
        System.out.println(map.entrySet());
        System.out.println(AAndE.hasAbbreviation("GL", map));
        System.out.println(AAndE.findExplanationFor("MB", map));
        AAndE.printAbbreviations(map);
        AAndE.printAbbreviationsWhere("My bad", map);
    }
}
