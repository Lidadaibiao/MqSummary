package someDemon.ThreadCommunication;

/**
 * @author dadaibiaoLi
 * @Desc   生产者消费者模式的一个复习
 * 两个线程，一个线程打印1-52，另一个打印字母A-Z打印顺序为12A34B...5152Z,
 * 要求用线程间通信
 * 步骤：
 * 判断+干活+通知
 * 为了防止虚假唤醒，判断的时候不能用If  必须用while
 * @Date 2021/9/29 14:17
 */
public class ProdConsumeDemon {
    public static void main(String[] args) {
        Print print  = new Print();
        new Thread(()->{
            for (int i = 0; i < 26; i++) {
                print.printZIMU();
            }
        },"字母").start();

        new Thread(()->{
            for (int i = 0; i < 26; i++) {
                print.printSHUZI();
            }
        },"数字").start();
    }
}
