package by.it_academy.lesson11;

public class StandardSensor implements Sensor {
    private static int sensorTurn = 1;
    private int readSensorInfo;

    public StandardSensor(int readSensorInfo) {
        this.readSensorInfo = readSensorInfo;
    }

    public void setSensorTurn(int sensorTurn) {
        StandardSensor.sensorTurn = sensorTurn;
    }
    public int getSensorTurn() {
        return sensorTurn;
    }

    public void setReadSensorInfo(int readSensorInfo) {
        this.readSensorInfo = readSensorInfo;
    }
    public int getReadSensorInfo() {
        return readSensorInfo;
    }

    @Override
    public boolean isOn() {
        return getSensorTurn() == 1;
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {
    }

    @Override
    public double read() {
        try {
            if (getSensorTurn() == 1) {
                return getSensorTurn();
            } else {
                throw new IllegalStateException();
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        return getReadSensorInfo();
    }

    @Override
    public String toString() {
        String sensorInfo;
        if (getSensorTurn() == 1) {
            sensorInfo = "sensor is on";
        } else {
            sensorInfo = "sensor off";
        }
        return "Sensor {" + sensorInfo +
                ", readSensorInfo=" + getReadSensorInfo() +
                '}';
    }

    public static void main(String[] args) {
        StandardSensor sensor1 = new StandardSensor(5);
        sensor1.setSensorTurn(1);
        System.out.println(sensor1);
        System.out.println(sensor1.isOn());
        sensor1.setOn();
        sensor1.setOff();
        System.out.println(sensor1.read());
    }
}