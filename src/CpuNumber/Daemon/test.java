package CpuNumber.Daemon;

/**
 * @projectName: Change _Through
 * @package: CpuNumber.Daemon
 * @className: test
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/21 09:33
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        MyDaemon myDaemon = new MyDaemon();
        myDaemon.setDaemon(true);
        myDaemon.start();
        for (int i = 0; i < 15; i++) {
            System.out.println(Thread.currentThread().getName() + "执行中");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyDaemon extends Thread{
    @Override
    public void run() {
        while (true){
            Thread.currentThread().setName("守护线程");
            System.out.println( Thread.currentThread().getName() + "执行中");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}