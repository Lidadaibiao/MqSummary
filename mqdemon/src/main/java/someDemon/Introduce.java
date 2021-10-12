package someDemon;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/9/29 11:32
 */
public class Introduce {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建线程的方式
        //第一种方式 继承thread类
//        Mythread mythread = new Mythread();
//        mythread.start();
//        doSomething();
        //第二种方式//第二种方式实现Runnable接口
//        Mythread2 mythread2 = new Mythread2();
//        new Thread(mythread2).start();
//        doSomething();

        //第三种方式实现Callable接口
        Mythread3 mythread3 = new Mythread3();
        FutureTask<String> futureTask = new FutureTask<String>(mythread3);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }

    public static void doSomething() {
        System.out.println(Thread.currentThread().getName() + "\tmain中的doSomeThing");
    }
}

class Mythread extends Thread {
    @Override
    public void run() {
        doSomeThing();
    }

    public void doSomeThing() {
        System.out.println(Thread.currentThread().getName() + "\t线程创建1--继承thread-----");
    }
}

class Mythread2 implements Runnable {

    @Override
    public void run() {
        doSomeThing();
    }

    public void doSomeThing() {
        System.out.println(Thread.currentThread().getName() + "\t线程创建2--实现runable接口-----");
    }
}

class Mythread3 implements Callable<String> {

    @Override
    public String call() throws Exception {

        doSomeThing();
        return "需要返回的值";
    }

    public void doSomeThing() {
        System.out.println(Thread.currentThread().getName() + "\t线程创建3--Callable-----");
    }
}
