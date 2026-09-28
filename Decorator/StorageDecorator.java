package Decorator;

public abstract class StorageDecorator implements StreamStorage {
    protected final StreamStorage wrapper;

    public StorageDecorator(StreamStorage wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }
}
