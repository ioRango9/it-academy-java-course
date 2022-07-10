package by.it_academy.lesson11;

import java.util.LinkedList;
import java.util.List;

public class AverageSensor extends TemperatureSensor implements Sensor {
    private static final List<AverageSensor> listSensors = new LinkedList<>();
    private static double averageReadInfoSensor;

    public AverageSensor(int readSensorInfo) {
        super(readSensorInfo);
    }
    public AverageSensor() {
        super(1);
    }

    @Override
    public double read() {
        try {
            if (getSensorTurn() == 1) {
                return averageReadInfoSensor / listSensors.size();
            } else {
                throw new IllegalStateException();
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        return getSensorTurn();
    }

    public void addSensor(int readSensorInfo) {
        listSensors.add(new AverageSensor(readSensorInfo));
        averageReadInfoSensor += readSensorInfo;
    }

    public static void main(String[] args) {
        AverageSensor averageSensor = new AverageSensor();
        averageSensor.addSensor(25);
        averageSensor.addSensor(98);
        averageSensor.addSensor(65);
        System.out.println(listSensors);
        averageSensor.setOff();
        System.out.println(listSensors);
        averageSensor.setOn();
        System.out.println(listSensors);
        averageSensor.setOff();
        System.out.println(averageSensor.read());
    }
}
