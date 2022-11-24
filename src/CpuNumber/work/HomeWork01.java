package CpuNumber.work;

import java.util.Random;
import java.util.Scanner;

/**
 * @projectName: Change _Through
 * @package: CpuNumber.work
 * @className: HomeWork01
 * @author: 薛淮予
 * @description:
 * (1)  在main方法中启动两个线程
 * (2)  第1个线程循环随机打印100以内的整数
 * (3） 直到第2个线程从键盘读取了“Q” 命令。
 * @date: 2022/11/23 09:14
 * @version: 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        fun1 fun1 = new fun1();
        fun2 fun2 = new fun2();
        new Thread(fun1).start();
        new Thread(fun2).start();
    }
}
class fun1 implements Runnable{
    private static boolean Flap = true;

    public boolean isFlap() {
        return Flap;
    }

    public void setFlap(boolean flap) {
        Flap = flap;
    }
    Random random = new Random();
    @Override
    public void run() {
        while (isFlap()){
            System.out.println(random.nextInt(101));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class fun2 extends fun1 implements Runnable{
    Scanner input = new Scanner(System.in);
    String string ;
    @Override
    public void run() {
        while (isFlap()){
            string = input.next();
            if (string.equals("Q")){
                System.err.println("退出");
                setFlap(false);
                //return;
            }
        }
    }
}