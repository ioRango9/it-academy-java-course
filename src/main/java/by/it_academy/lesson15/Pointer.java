package by.it_academy.lesson15;

public class Pointer {
    private final int x;
    private final int y;

    public Pointer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pointer() {
        this(0, 1);
    }

    public Pointer left() {
        return new Pointer(-y, x);
    }

    public Pointer right() {
        return new Pointer(y, -x);
    }

    public void apply(int[] coordinates) {
        coordinates[0] += x;
        coordinates[1] += y;
    }
}
