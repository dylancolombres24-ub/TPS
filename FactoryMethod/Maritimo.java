package FactoryMethod;

public class Maritimo implements Transporte {
    @Override
    public void deliver() {
        System.out.println("Entrega realizada por contenedor marítimo.");
    }

    @Override
    public double calculateCost(double distance) {
        return distance * 3.2;
    }
}
