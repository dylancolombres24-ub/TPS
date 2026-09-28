package Decorator;

public class CompressedStorageDecorator extends StorageDecorator {
    public CompressedStorageDecorator(StreamStorage wrapper) {
        super(wrapper);
    }

    @Override
    public void writeData(String data) {
        String compressed = "[ZIP]" + data + "[/ZIP]";
        super.writeData(compressed);
    }
}
