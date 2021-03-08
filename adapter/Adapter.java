package adapter;

public class Adapter implements NetToUSB {
    private Wire wire;

    public Adapter(Wire wire) {
        this.wire = wire;
    }

    @Override
    public void requestHandle() {
        wire.request();
    }
}
