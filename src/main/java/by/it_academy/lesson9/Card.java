package by.it_academy.lesson9;

public class Card implements Comparable {
    private int price;

    public String toString(Suit suit) {
        switch (price) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return "" + suit + price;
            case 11:
                return suit + " J";
            case 12:
                return suit + " Q";
            case 13:
                return suit + " K";
            case 14:
                return suit + " A";
            default:
        }
        return "";
    }


    public static void main(String[] args) {
        Card card = new Card();
        card.price = 14;
        System.out.println(card.toString(Suit.HEART));
        Suit[] arrayCard = new Suit[]{Suit.DIAMOND, Suit.CLUB, Suit.HEART, Suit.SPADE};
        for (Suit i : arrayCard) {
            System.out.println(i);
        }
    }


    @Override
    public boolean CompareCards(Suit suit) {
        return true;
    }
}
