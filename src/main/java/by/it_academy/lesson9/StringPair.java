package by.it_academy.lesson9;

public class StringPair extends ComparablePair<String> {

    public StringPair(String leftElement, String rightElement) {
        super(leftElement, rightElement);
    }

    public static void main(String[] args) {
        StringPair stringPair = new StringPair("a", "aa");
        System.out.println(stringPair.isLeftGreaterThanRight());
    }
}

