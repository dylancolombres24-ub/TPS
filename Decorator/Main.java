package Decorator;

public class Main {
    public void main() {
        String playbackHistory = "User123: Watched Movie A at 10:15";

        IO.println("--- Almacenamiento Básico ---");
        StreamStorage storage = new BasicFileStorage();
        storage.writeData(playbackHistory);

        IO.println("\n--- Almacenamiento con Cifrado y Compresión ---");
        StreamStorage secureCompressedStorage = new CompressedStorageDecorator(
                new EncryptedStorageDecorator(new BasicFileStorage())
        );
        secureCompressedStorage.writeData(playbackHistory);
    }
}
