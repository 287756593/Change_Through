package CpuNumber.work;

import java.util.Random;
import java.util.Scanner;

/**
 * @projectName: Change _Through
 * @package: CpuNumber.work
 * @className: HomeWork01Plus
 * @author: 薛淮予
 * @description: 用守护线程机制 如果键盘读取到 Q 就结束 随机打印线程也同样结束
 * (1)  在main方法中启动两个线程
 * (2)  第1个线程循环随机打印100以内的整数
 * (3） 直到第2个线程从键盘读取了“Q” 命令。
 * @date: 2022/11/24 10:49
 * @version: 1.0
 */
public class HomeWork01Plus {
    public static void main(String[] args) {
        fun01 fun01 = new fun01();
        fun02 fun02 = new fun02();
       Thread thread01 = new Thread(fun01);
       Thread thread02 = new Thread(fun02);
       thread01.setDaemon(true);
       thread01.start();
       thread02.start();

    }

}

class fun01 implements Runnable {
    Random random = new Random();


    @Override
    public void run() {
        while (true) {
            System.out.println(random.nextInt(101));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class fun02 implements Runnable {

    Scanner input = new Scanner(System.in);
    String string;

    @Override
    public void run() {
        while (true) {
            string = input.next();
            if (string.equals("Q")) {
                System.err.println("退出");
                return;
            }
        }
    }
}
