package by.it_academy.lesson11;

import java.util.concurrent.ThreadLocalRandom;

public class TemperatureSensor extends StandardSensor implements Sensor {

    public TemperatureSensor(int readSensorInfo) {
        super(readSensorInfo);
    }


    @Override
    public void setOn() {
        setSensorTurn(1);
    }

    @Override
    public void setOff() {
        setSensorTurn(0);
    }

    @Override
    public double read() {
        try {
            if (getSensorTurn() == 1) {
                return ThreadLocalRandom.current().nextInt(-30, 31);
            } else {
                throw new IllegalStateException();
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        return getSensorTurn();
    }


    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor(9);
        temperatureSensor.setOff();
        System.out.println(temperatureSensor);
        System.out.println(temperatureSensor.read());
        System.out.println(temperatureSensor.isOn());
    }
}
