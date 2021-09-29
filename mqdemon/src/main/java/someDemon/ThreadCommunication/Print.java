package someDemon.ThreadCommunication;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/9/29 14:04
 */
public class Print {
        /**
         * 生产者消费者模式的一个复习
         * 两个线程，一个线程打印1-52，另一个打印字母A-Z打印顺序为12A34B...5152Z,
         要求用线程间通信
         步骤：
         判断+干活+通知
         为了防止虚假唤醒，判断的时候不能用If  必须用while
         */
        //待打印的数字
        private int number = 0;
        //待打印的字母
        private char c = 'A';
        //唤醒标志
        private boolean flag = false;
//        public synchronized void printZIMU() throws InterruptedException {
//            //判断 条件
//            while (flag){
//                this.wait();
//            }
//            //干活
//            System.out.println(Thread.currentThread().getName()+"------>::"+(c++));
//            //改变标志位
//            flag = true;
//            //通知其他的线程 开始干活
//            this.notifyAll();
//        }
//        public synchronized void printSHUZI() throws InterruptedException {
//            //判断
//            while (!flag){
//                this.wait();
//            }
//            //干活
//            System.out.println(Thread.currentThread().getName()+"----->:"+(number++));
//            System.out.println(Thread.currentThread().getName()+"----->:"+(number++));
//            //改变标志位
//            flag = false;
//            //通知其他线程
//            this.notifyAll();
//        }
        private Lock lock =new ReentrantLock();
        private Condition condition = lock.newCondition();
        public void printZIMU(){
            lock.lock();
            try {
                //判断
                while (flag){
                    condition.await();
                }
                //操作
                System.out.println(Thread.currentThread().getName()+"------>"+(c++));
                //改变修饰符
                flag = true;
                //通知
                condition.signalAll();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
        public void printSHUZI(){
            lock.lock();
            try {
                while (!flag){
                    condition.await();
                }
                //操作
                System.out.println(Thread.currentThread().getName()+"---->"+(number++));
                System.out.println(Thread.currentThread().getName()+"---->"+(number++));
                //改变标识符
                flag = false;
                //通知其他线程
                condition.signalAll();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
}
