package by.it_academy.lesson9;

import java.util.Comparator;

public class SuitComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        return o1.getSuit().compareTo(o2.getSuit());
    }
}
