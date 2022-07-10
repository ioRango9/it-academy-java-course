package by.it_academy.lesson9;

public class ComparablePair<T extends Comparable<T>> implements Pair<T, T> {
    public final T leftElement;
    public  final T rightElement;

    public ComparablePair(T leftElement, T rightElement) {
        this.leftElement = leftElement;
        this.rightElement = rightElement;
    }


    @Override
    public T left() {
        return leftElement;
    }

    @Override
    public T right() {
        return rightElement;
    }

    public boolean isLeftGreaterThanRight() {
        return left().compareTo(right()) > 0;
    }
}
