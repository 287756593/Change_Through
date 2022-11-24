package CpuNumber.joinTest;

/**
 * @projectName: Change _Through
 * @package: CpuNumber.joinTest
 * @className: JoinTest001
 * @author: 薛淮予
 * @description: join：线程的插队。插队的线程一旦插队成动，则肯定先执行完插入的线程所有的任务
 * 案例：main袋程創建一个子袋程，母隔1s 輸出 hello,
 * 輸出 20次，主袋程每隔1秒，輸出 hi, 輸出 20次.要求：
 * 西个线禮同时机行，為走线程輸出 5次后，就让子线程
 * 运行完毕，主线程再继续.
 * @date: 2022/11/19 10:49
 * @version: 1.0
 */
public class JoinTest001 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("hello \t" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class test {
    public static void main(String[] args) {
        JoinTest001 Test01 = new JoinTest001();
        Thread thread = new Thread(Test01);
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("hi \t" + i);
            if (i == 5) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}