package by.it_academy.lesson8;

public class Cat extends Animal implements NoiseCapable {


    public Cat(String name) {
        super(name);
    }

    public Cat() {
        this(null);
    }

    public void purr() {
        System.out.println(getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Lui");
        cat.makeNoise();
        System.out.println(cat.getName());
        cat.sleep();
        cat.eat();
        Cat cat1 = new Cat();
    }
}
