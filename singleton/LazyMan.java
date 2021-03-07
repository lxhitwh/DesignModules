package singleton;

public class LazyMan {
    // 双重检测模式，但是反射可以破坏单例
    private LazyMan() {

    }

    private volatile static LazyMan LazyMan;

    public static LazyMan getInstance() {
        if (LazyMan == null) {
            synchronized (LazyMan.class) {
                if (LazyMan == null) {
                    LazyMan = new LazyMan(); // 不是原子性操作
                    /**
                     * 1. 分配内存空间
                     * 2. 执行构造方法。初始化对象
                     * 3. 对象指向这个空间
                     *
                     * 指令会被重排
                     */
                }
            }
        }
        return LazyMan;
    }
}