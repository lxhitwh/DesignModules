package singleton;

// Enum本身也是一个class类，反射不能破坏Enum
public enum EnumSingle {

    INSTANCE;

    public EnumSingle getInstance() {
        return INSTANCE;
    }
}