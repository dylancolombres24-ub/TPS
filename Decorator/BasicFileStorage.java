package Decorator;

public class BasicFileStorage implements StreamStorage {
    @Override
    public void writeData(String data) {
        IO.println("Escribiendo datos en el archivo local: [" + data + "]");
    }
}