package factory.abstract1;

public class Consumer {
    public static void main(String[] args) {
        // 华为家
        IProductFactory huaWeiFactory = new HuaWeiFactory();
        huaWeiFactory.iPhoneProduct().print();
        huaWeiFactory.iRouterProduct().print();
        // 小米家
        IProductFactory miFactory = new MiFactory();
        miFactory.iPhoneProduct().print();
        miFactory.iRouterProduct().print();
    }
}
