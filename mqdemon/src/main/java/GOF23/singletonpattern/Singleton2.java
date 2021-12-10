package GOF23.singletonpattern;

/**
 * @author dadaibiaoLi
 * @Desc   实现二：延迟加载 / “懒汉模式”
 * @Date 2021/12/10 16:28
 */
public class Singleton2 {

    /**
     *
     * 延迟加载就是调用get()方法时实例才被创建（先不急着实例化出对象，等要用的时候才给你创建出来。不着急，故又称为“懒汉模式”）
     * 常见的实现方法就是在get方法中进行new实例化。
     *
     */


    //将自身实例化对象设置为一个属性，并用static修饰
    private static Singleton2 instance;

    // 构造方法私有化
    private Singleton2(){

    }

    //静态方法返回实例
    private static Singleton2 getInstance(){

        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }

    /**
     * “懒汉模式”的优缺点：
     *
     * 优点：实现起来比较简单，当类SingletonTest被加载的时候，静态变量static的instance未被创建并分配内存空间，
     * 当getInstance方法第一次被调用时，初始化instance变量，并分配内存，因此在某些特定条件下会节约了内存。
     *
     * 缺点：在多线程环境中，这种实现方法是完全错误的，根本不能保证单例的状态。
     */
}
