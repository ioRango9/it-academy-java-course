package by.it_academy.lesson11;

public class StandardSensor implements Sensor {
    private int sensor = 1;

    public StandardSensor(int sensor) {
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return "StandardSensor{" +
                "sensor=" + sensor +
                '}';
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

    public static void main(String[] args) {
        StandardSensor standardSensor = new StandardSensor(1);
        System.out.println(standardSensor.isOn());
        System.out.println(standardSensor.read());
    }
}