package GOF23.singletonpattern;

/**
 * @author dadaibiaoLi
 * @Desc  实现四：DCL双检查锁机制（DCL：double checked locking）
 * @Date 2021/12/10 16:32
 */
public class Singleton4 {


    // 将自身实例化对象设置为一个属性，并用static修饰
    private static Singleton4 instance;

    //私有化构造方法
    private Singleton4(){}

    // 静态方法返回该实例

    public static Singleton4 getInstance(){
// 第一次检查instance是否被实例化出来，如果没有进入if块
        if (instance == null){
            synchronized (Singleton4.class){
                // 某个线程取得了类锁，实例化对象前第二次检查instance是否已经被实例化出来，如果没有，才最终实例出对象
                if (instance == null){

                    instance = new Singleton4();
                }
            }

        }
        return instance;
    }
    //方法四算是单例模式的最佳实现方式。内存占用率高，效率高，线程安全，多线程操作原子性。
}
