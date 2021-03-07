package builder;

public abstract class Builder {
    public abstract Builder setCup(String msg); // 杯子大小
    public abstract Builder setDrink(String msg); // 咖啡牛奶
    public abstract Builder setSell(String msg); // 堂食外卖
    public abstract Product getProduct(); // 获取最终产品
}
