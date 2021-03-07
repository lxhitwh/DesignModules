package factory.simple;

import factory.bean.Car;

public class Consumer {
    public static void main(String[] args) {
        Car car = CarSimpleFactory.getCar("五菱");
        Car car2 = CarSimpleFactory.getCar("特斯拉");
    }
}
