package FactoryMethod;

public class Main {
    public void main() {
        System.out.println("--- Envío Urgente Urbano ---");
        Logistica logisticaDrone = new LogisticaDrone();
        logisticaDrone.planDelivery(15.0);

        System.out.println("\n--- Envío Internacional Masivo ---");
        Logistica logisticaMarina = new LogisticaMaritima();
        logisticaMarina.planDelivery(500.0);
    }
}
