package AbstracFactory;

public class ZigbeeFactory implements SmartHomeFactory {
    @Override
    public Switch createSwitch() {
        return new ZigbeeSwitch();
    }

    @Override
    public TempSensor createTempSensor() {
        return new ZigbeeSensor();
    }
}


