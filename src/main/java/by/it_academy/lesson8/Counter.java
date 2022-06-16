package by.it_academy.lesson8;

public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;
    }

    public void increase(int increaseBy) {
        value += increaseBy;
    }

    public void decrease(int decreaseBy) {
        value -= decreaseBy;
    }

    public static void main(String[] args) {
        Counter counter = new Counter(25);
        counter.increase();
        System.out.println(counter.getValue());
        counter.decrease(24);
        counter.increase(3);
        counter.increase();
        System.out.println(counter.getValue());
    }
}
