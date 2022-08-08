package by.it_academy.lesson11;

import java.util.LinkedList;
import java.util.List;

public class HomeWork1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        List<Integer> listNumbers = new LinkedList<>();
        list.add("5");
        list.add("oops");
        list.add("36");
        list.add("wops");
        for (int i = 0; i < list.size(); i++) {
            try {
                int numbers = Integer.parseInt(list.get(i));
                listNumbers.add(numbers);
            } catch (NumberFormatException e) {
                System.out.println("'" + list.get(i) + "' is not a number");
            }
        }
        System.out.println(listNumbers);
    }
}
