package factory.factory;

import factory.bean.Car;
import factory.bean.WuLing;

public class WuLingFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
