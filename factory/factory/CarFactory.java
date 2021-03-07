package factory.factory;

import factory.bean.Car;

// 普通工厂模式
// 增加产品，不用修改已有代码，动态扩展
public interface CarFactory {
    Car getCar();
}
