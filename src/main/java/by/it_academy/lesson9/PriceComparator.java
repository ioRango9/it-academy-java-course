package by.it_academy.lesson9;

import java.util.Comparator;

public class PriceComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
