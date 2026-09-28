package Decorator;

public class EncryptedStorageDecorator extends StorageDecorator {
    public EncryptedStorageDecorator(StreamStorage wrapper) {
        super(wrapper);
    }

    @Override
    public void writeData(String data) {
        String encrypted = "[ENCRYPTED]" + data + "[/ENCRYPTED]";
        super.writeData(encrypted);
    }
}
