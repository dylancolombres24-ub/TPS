package AbstracFactory;

public class ZWaveSwitch implements Switch {
    @Override
    public void turnOn() {
        IO.println("ZWave: Encendiendo dispositivo en frecuencia sub-GHz.");
    }
}
