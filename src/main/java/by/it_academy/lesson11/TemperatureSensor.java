package by.it_academy.lesson11;

import java.util.concurrent.ThreadLocalRandom;

public class TemperatureSensor implements Sensor{
private int sensor = 0;

    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "sensor=" + sensor +
                '}';
    }

    @Override
    public boolean isOn() {
        if (sensor == 1) {
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        sensor = 1;
    }

    @Override
    public void setOff() {
        sensor = 0;
    }

    @Override
    public int read() {
        if (sensor == 1) {
            return ThreadLocalRandom.current().nextInt(-30, 31);
        } else {
            throw new IllegalStateException("Sensor is off!");
        }
    }

    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        System.out.println(temperatureSensor.isOn());
        temperatureSensor.setOn();
        System.out.println(temperatureSensor.isOn());
        System.out.println(temperatureSensor.read());
    }
}
