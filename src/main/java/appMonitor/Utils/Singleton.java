package appMonitor.Utils;

/**
 * Create By zhangdd happy programming....
 *
 * @Author zhangdd
 * @Date 2019/6/14  23:43
 * @Version 1.0
 */
public class Singleton {
    //双检锁/双重校验锁
    private volatile static Singleton singleton;

    private Singleton (){}

    //对外提供唯一全局访问点
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
