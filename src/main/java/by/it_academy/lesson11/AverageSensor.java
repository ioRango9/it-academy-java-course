package by.it_academy.lesson11;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private final List<Sensor> listSensors = new ArrayList<>();

    public void addSensors(Sensor toAdd) {
        listSensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor iterate : listSensors) {
            if (!iterate.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor iterate : listSensors) {
            iterate.setOn();
        }

    }

    @Override
    public void setOff() {
        for (Sensor iterate : listSensors) {
            iterate.setOff();
        }
    }

    @Override
    public int read() {
        int countIncludedSensors = 0;
        int valuesIncludedSensors = 0;
        for (Sensor iterate : listSensors) {
            if (iterate.isOn()) {
                countIncludedSensors++;
                valuesIncludedSensors += iterate.read();
            }
        }
        System.out.print("Average values sensors are: ");
        return valuesIncludedSensors / countIncludedSensors;
    }

    public static void main(String[] args) {
        AverageSensor sensor = new AverageSensor();
        sensor.addSensors(new TemperatureSensor());
        sensor.addSensors(new StandardSensor(1));
        sensor.addSensors(new TemperatureSensor());
        System.out.println(sensor.listSensors);
        System.out.println(sensor.read());
        System.out.println(sensor.isOn());
        sensor.setOn();
        System.out.println(sensor.listSensors);
        System.out.println(sensor.isOn());
        System.out.println(sensor.read());
    }
}
