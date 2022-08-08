package by.it_academy.lesson11;

public class StandardSensor implements Sensor {

    private final int sensor;

    public StandardSensor(int sensor) {
        this.sensor = sensor;
    }

    public static void main(String[] args) {
        StandardSensor standardSensor = new StandardSensor(1);
        System.out.println(standardSensor.isOn());
        System.out.println(standardSensor.read());
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return sensor;
    }

    @Override
    public String toString() {
        return "StandardSensor{" +
            "sensor=" + sensor +
            '}';
    }

}