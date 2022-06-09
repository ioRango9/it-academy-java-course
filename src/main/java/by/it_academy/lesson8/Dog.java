package by.it_academy.lesson8;

public class Dog extends Animal implements NoiseCapable{
    private String name;


    public Dog(String name) {
        super(name);
    }

    public Dog() {
        this(null);
    }

    public void bark() {
        System.out.println(getName() + " barks");
    }

    @Override
    public void makeNoise() {
        bark();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Armstrong");
        dog.bark();
        dog.sleep();
        dog.eat();
    }
}
