package by.it_academy.lesson5;

public class Whistle {
    private String sound;

    private Whistle(String sound) {
        this.sound = sound;
    }

    private  void sound() {
        System.out.println(sound);
    }

    public static void main(String[] args) {
        Whistle sounds = new Whistle("Meow!");
        sounds.sound();
    }
}
