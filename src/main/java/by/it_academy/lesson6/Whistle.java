package by.it_academy.lesson6;

public class Whistle {
    private String sound;

    Whistle(String sound) {
        this.sound = sound;
    }

    public static void main(String[] args) {
        Whistle whistle = new Whistle("Meow!");
        whistle.sound();
    }

    void sound() {
        System.out.println(sound);
    }
}
