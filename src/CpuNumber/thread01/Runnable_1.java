package CpuNumber.thread01;

/**
 * @projectName: Change _Through
 * @package: CpuNumber.thread01
 * @className: Runnable_1
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/16 07:41
 * @version: 1.0
 */
public class Runnable_1 {
    public static void main(String[] args) {
        dog dog = new dog();
        Thread thread = new Thread(dog);
        thread.start();

    }
}


class dog implements Runnable {

    @Override
    public void run() {
        int count = 0;
        while (true) {
            System.out.println("汪汪汪，我是修狗狗 count = " + (++count) +  "线程名 = " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 15) {
                break;
            }
        }
    }
}
