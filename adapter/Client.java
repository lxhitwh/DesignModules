package adapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Wire wire = new Wire();
        Adapter adapter = new Adapter(wire);

        computer.net(adapter);
    }
}
