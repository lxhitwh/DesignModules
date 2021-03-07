package factory.abstract1;

public class HuaWeiFactory implements IProductFactory{
    @Override
    public IPhoneProduct iPhoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new HuaWeiRouter();
    }
}
