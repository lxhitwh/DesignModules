package builder;

public class Worker extends Builder {
    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    public Builder setCup(String cup) {
        product.setCup(cup);
        return this;
    }

    @Override
    public Builder setDrink(String drink) {
        product.setDrink(drink);
        return this;
    }

    @Override
    public Builder setSell(String sell) {
        product.setSell(sell);
        return this;
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
