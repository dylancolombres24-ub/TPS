package AbstracFactory;

public class ZWaveFactory implements SmartHomeFactory {
    @Override
    public Switch createSwitch() {
        return new ZWaveSwitch();
    }

    @Override
    public TempSensor createTempSensor() {
        return new ZWaveSensor();
    }
}
