package AbstracFactory;

public class Main {
    public void main() {
        SmartHomeFactory factory = new ZigbeeFactory();

        Switch light = factory.createSwitch();
        TempSensor sensor = factory.createTempSensor();

        light.turnOn();
        IO.println("Temperatura: " + sensor.readTemperature() + " °C");
    }
}
