package FactoryMethod;

public class Drone implements Transporte {
    @Override
    public void deliver() {
        System.out.println("Entrega realizada vía aérea mediante Dron de alta velocidad.");
    }

    @Override
    public double calculateCost(double distance) {
        return distance * 12.5;
    }
}
