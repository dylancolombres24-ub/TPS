package AbstracFactory;

public class ZWaveSensor implements TempSensor {
    @Override
    public double readTemperature() {
        IO.println("ZWave: Obteniendo telemetría de temperatura...");
        return 24.1;
    }
}
