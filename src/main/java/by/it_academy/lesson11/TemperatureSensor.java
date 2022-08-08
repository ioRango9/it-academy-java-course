package by.it_academy.lesson11;

import java.util.concurrent.ThreadLocalRandom;

public class TemperatureSensor implements Sensor {

    private boolean isOn = false;

    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        System.out.println(temperatureSensor.isOn());
        temperatureSensor.setOn();
        System.out.println(temperatureSensor.isOn());
        System.out.println(temperatureSensor.read());
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        isOn = true;
    }

    @Override
    public void setOff() {
        isOn = false;
    }

    @Override
    public int read() {
        if (isOn) {
            return ThreadLocalRandom.current().nextInt(-30, 31);
        } else {
            throw new IllegalStateException("Sensor is off!");
        }
    }

    @Override
    public String toString() {
        return "TemperatureSensor{" +
            "isOn=" + isOn +
            '}';
    }

}
