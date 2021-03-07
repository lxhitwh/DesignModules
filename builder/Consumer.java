package builder;

public class Consumer {
    public static void main(String[] args) {
        Worker worker = new Worker();
        // 链式编程，建造者按照客户指定要求进行建造
        Product product = worker.setCup("超大杯").setSell("外卖").getProduct();
    }
}
