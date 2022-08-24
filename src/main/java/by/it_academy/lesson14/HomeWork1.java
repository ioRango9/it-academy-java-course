package by.it_academy.lesson14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        printNumbersFromConsole();
    }

    private static void printNumbersFromConsole() {
        ArrayList<Integer> listNumbers = new ArrayList<>();
        try (Scanner enterNumbers = new Scanner(System.in)) {
            while (enterNumbers.hasNext()) {
                int number = Integer.parseInt(enterNumbers.nextLine());
                if (number == -1) {
                    break;
                }
                listNumbers.add(number);
            }
            System.out.println("Entered numbers in diapason [1;5]");
            listNumbers.stream()
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .filter(numbers -> numbers >= 1 && numbers <= 5)
                    .forEach(System.out::println);
        } catch (NumberFormatException e) {
            System.out.println(" it's not number");
        }
    }
}
