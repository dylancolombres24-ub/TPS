package AbstracFactory;

public interface SmartHomeFactory {
    Switch createSwitch();
    TempSensor createTempSensor();
}
