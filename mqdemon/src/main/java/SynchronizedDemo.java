/**
 * @author dadaibiaoLi
 * @Desc  synchronized 同步语句块的情况
 * @Date 2021/12/10 16:36
 */
public class SynchronizedDemo {

    public static void main(String[] args) {
        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
        synchronizedDemo.method();
    }
        public void method() {
            synchronized (this) {
                System.out.println("synchronized 代码块");
            }
        }
    }

