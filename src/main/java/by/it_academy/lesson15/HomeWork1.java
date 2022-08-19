package by.it_academy.lesson15;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class HomeWork1 {

    public static void main(String[] args) {
        ArrayList<Integer> listNumbers = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            listNumbers.add(i);
        }
        BigInteger factorial = listNumbers.stream()
                .parallel()
                .map(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);

        System.out.println(new DecimalFormat("0.###E0").format(factorial));
    }

}
