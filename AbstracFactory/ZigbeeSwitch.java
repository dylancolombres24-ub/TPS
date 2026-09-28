package AbstracFactory;

public class ZigbeeSwitch implements Switch {
    @Override
    public void turnOn() {
        IO.println("Zigbee: Encendiendo luz con protocolo IEEE 802.15.4.");
    }
}
