package GOF23.singletonpattern;

/**
 * @author dadaibiaoLi
 * @Desc 实现三：线程安全的“懒汉模式”
 * @Date 2021/12/10 16:31
 */
public class Singleton3 {


    private static Singleton3 instance;


    //构造方法私有化
    private Singleton3(){}

    // 静态方法返回该实例，加synchronized关键字实现同步
    public static synchronized  Singleton3 getInstance(){
        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }

    /**
     * 优点：在多线程情形下，保证了“懒汉模式”的线程安全。
     *
     * 缺点：众所周知在多线程情形下，synchronized方法通常效率低，显然这不是最佳的实现方案。
     *
     *
     */
}
