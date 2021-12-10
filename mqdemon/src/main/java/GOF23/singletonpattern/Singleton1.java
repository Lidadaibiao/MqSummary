package GOF23.singletonpattern;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/12/10 16:26
 */
public class Singleton1 {

    /**
     *
     * 实现一：立即加载 / “饿汉模式”
     *
     * 立即加载就是使用类的时候已经将对象创建完毕（不管以后会不会使用到该实例化对象，先创建了再说。很着急的样子，故又被称为“饿汉模式”），常见的实现办法就是直接new实例化。
     *
     *
     */

    // 将自身实例化对象设置为一个属性，并用static、final修饰
    private static final Singleton1 instance = new Singleton1();

    // 构造方法私有化
    private Singleton1(){}

    // 静态方法返回该实例
    private static Singleton1 getInstance(){
        return instance;
    }

    /**
     * “饿汉模式”的优缺点：
     *
     * 优点：实现起来简单，没有多线程同步问题。
     *
     * 缺点：当类SingletonTest被加载的时候，会初始化static的instance，静态变量被创建并分配内存空间，从这以后，
     *
     *
     * 这个static的instance对象便一直占着这段内存（即便你还没有用到这个实例），当类被卸载时，静态变量被摧毁，并释放所占有的内存，因此在某些特定条件下会耗费内存。
     */
}