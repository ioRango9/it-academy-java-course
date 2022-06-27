package by.it_academy.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {

    private static double average (List<Integer> numbers) {
        double sums = 0;
        int counter = 0;
        for (Integer average : numbers) {
            sums += average;
            counter++;
        }
        return sums / counter;
    }

    private static void printlnRange(List<Integer> numbers, int lowerLimit, int upperLimit) {
        List<Integer> list = new ArrayList<>();
        for (Integer range : numbers) {
            if (range >= lowerLimit && range <= upperLimit) {
                list.add(range);
            }
        }
        System.out.printf("All numbers in the range [%d;%d] = %s", lowerLimit, upperLimit, list);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(ThreadLocalRandom.current().nextInt(1, 51));
        }
        System.out.println(numbers);
        System.out.println(average(numbers));
        printlnRange(numbers, 15, 30);
    }
}
