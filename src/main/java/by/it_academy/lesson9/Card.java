package by.it_academy.lesson9;


import java.util.Comparator;
import java.util.TreeSet;

public class Card {
    private final int price;
    private final Suit suit;

    public Card(int price, Suit suit) {
        this.price = price;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        if (price >= 1 && price <= 10) {
            return suit + " " + price;
        } if (price == 11) {
            return suit + " J";
        } if (price == 12) {
            return suit + " Q";
        } if (price == 13) {
            return suit + " K";
        } if (price == 14) {
            return suit + " A";
        } else  {
            return "Mistake";
        }
    }



    public static void main(String[] args) {

        Comparator<Card> cardComparator = new SuitComparator().thenComparing(new PriceComparator());
        TreeSet<Card> cardSet = new TreeSet(cardComparator);
        cardSet.add(new Card(11, Suit.CLUB));
        cardSet.add(new Card(4, Suit.SPADE));
        cardSet.add(new Card(1, Suit.HEART));
        cardSet.add(new Card(13, Suit.DIAMOND));
        cardSet.add(new Card(4, Suit.HEART));
        cardSet.add(new Card(7, Suit.CLUB));
        for (Card card : cardSet) {
            System.out.println(card);
        }
    }
}
