package prototype;

public class Video implements Cloneable {
    // 对除基本类型外的变量进行浅拷贝
    // 若想深拷贝，可在return前对成员变量调用clone()方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
