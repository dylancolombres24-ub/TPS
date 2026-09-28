package FactoryMethod;

public abstract class Logistica {
    protected abstract Transporte createTransport();

    public void planDelivery(double distance) {
        Transporte transport = createTransport();
        double cost = transport.calculateCost(distance);
        System.out.println("Costo estimado del envío: $" + cost);
        transport.deliver();
    }
}