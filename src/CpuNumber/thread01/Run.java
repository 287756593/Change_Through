package CpuNumber.thread01;

/**
 * @projectName: Change _Through
 * @package: CpuNumber.thread01
 * @className: Run
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/16 20:03
 * @version: 1.0
 */
public class Run {
    public static void main(String[] args) {
        hi hi = new hi();
        Hello hello = new Hello();
        Thread ThreadHi = new Thread(hello);
        Thread ThreadHello = new Thread(hello);
        ThreadHello.start();
        ThreadHi.start();

    }
}
class hi implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HI 当前线程 = " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class Hello implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("Hello  当前线程 = " +Thread.currentThread().getName() + " i = " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}