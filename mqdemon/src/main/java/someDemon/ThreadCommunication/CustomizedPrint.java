package someDemon.ThreadCommunication;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dadaibiaoLi
 * @Desc 线程间 定制化调用接口
 * 比如：A 输出1-5
 * 比如：B 输出1-10
 * C 输出 1-2
 * 顺序必须一致循环5次
 * @Date 2021/9/29 17:44
 */
public class CustomizedPrint {
    //定义标志位
    private int flag = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();

    //打印A
    private void printA() {
        lock.lock();
        try {
            //判断
            while (flag != 0) {
                condition1.await();
            }
            //操作
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "----->" + "A");
            }
            //改变标志位
            flag = 1;
            //唤醒指定
            condition2.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    //打印B
    public void printB() {
        lock.lock();
        try {
            //判断
            while (flag != 1) {
                condition2.await();
            }
            //操作
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "----->" + "B");
            }
            //改变标识位
            flag = 2;
            //通知
            condition3.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    //打印C
    public void printC() {
        lock.lock();
        try {
            //判断
            while (flag != 2) {
                condition3.await();
            }
            //操作
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "----->" + "C");
            }
            //改变标识位
            flag = 0;
            //通知
            condition1.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
