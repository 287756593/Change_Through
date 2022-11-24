package CpuNumber.Thread02;

/**
 * @projectName: Change _Through
 * @package: CpuNumber.Thread02
 * @className: ThreadTest
 * @author: 薛淮予
 * @description: 多线程学习
 * @date: 2022/11/18 08:58
 * @version: 1.0
 */
public class ThreadTest implements Runnable {
    private Boolean flap = true;

    @Override
    public void run() {
        Thread.currentThread().setName("吃包子");
        int i = 0;
        while (flap) {
            System.out.println("我吃包子 ： " + (++i));
            if (i >= 100) {
                try {
                    Thread.sleep(10 * 1000);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + "被interrupt了");
                    i = 0;
                }
            }
        }
    }

    public void setFlap(Boolean flap) {
        this.flap = flap;
    }
}

class test {
    public static void main(String[] args) throws InterruptedException {
        ThreadTest threadTest = new ThreadTest();
        Thread thread01 = new Thread(threadTest);
        thread01.setPriority(Thread.MIN_PRIORITY);
        System.out.println("线程优先级 = " + thread01.getPriority());
        thread01.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(100);
        }
        thread01.interrupt();
    }
}