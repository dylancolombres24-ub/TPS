package FactoryMethod;

public class LogisticaMaritima extends Logistica {
    @Override
    protected Transporte createTransport() {
        return new Maritimo();
    }
}
