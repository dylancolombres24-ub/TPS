package FactoryMethod;

public class LogisticaDrone extends Logistica {
    @Override
    protected Transporte createTransport() {
        return new Drone();
    }
}
