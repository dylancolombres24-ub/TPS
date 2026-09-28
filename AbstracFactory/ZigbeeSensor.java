package AbstracFactory;

public class ZigbeeSensor implements TempSensor {
    @Override
    public double readTemperature() {
        IO.println("Zigbee: Leyendo sensor de temperatura...");
        return 22.5;
    }
}
