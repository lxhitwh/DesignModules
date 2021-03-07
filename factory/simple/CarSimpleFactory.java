package factory.simple;

import factory.bean.Car;
import factory.bean.Tesla;
import factory.bean.WuLing;

// 简单工厂模式
// 增加一个新产品，如果不修改代码就不能增加
public class CarSimpleFactory {
    public static Car getCar(String car) {
        if (car.equals("五菱")) {
            return new WuLing();
        } else if (car.equals("特斯拉")) {
            return new Tesla();
        } else {
            return null;
        }
    }
}
