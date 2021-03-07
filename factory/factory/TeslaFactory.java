package factory.factory;

import factory.bean.Car;
import factory.bean.Tesla;

public class TeslaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
