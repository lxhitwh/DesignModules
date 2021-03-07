package factory.abstract1;

public class MiFactory implements IProductFactory{
    @Override
    public IPhoneProduct iPhoneProduct() {
        return new MiPhone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new MiRouter();
    }
}
