package CpuNumber.thread01;

/**
 * @projectName: Change _Through
 * @package: CpuNumber.thread01
 * @className: miaomiaomiao
 * @author: 薛淮予
 * @description: 演示 通过继承 Thread类 来创建线程 jconsole(姐康搜) 用来监控
 * @date: 2022/11/15 16:37
 * @version: 1.0
 */
public class miaomiaomiao extends Thread {
    @Override
    public void run() {
        int count = 1;
        while (true) {
            System.out.println("喵喵，我是一只小猫咪\t" + count  + "线程名称 = "+ Thread.currentThread().getName());
            //休眠1秒 使用slepp ctrltalt+t
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            count++;
            if (count == 80){
                break;
            }
        }
    }

    public static void main(String[] args) {
        miaomiaomiao miao1 = new miaomiaomiao();
        miaomiaomiao miao = new miaomiaomiao();
       // miao.run();//run 方法就是mian调用的一个普通的方法 并没有真正的启动线程 就会阻塞 需要执行完毕 才可以执行下面的代码
        miao.start();
        miao1.start();
        System.out.println("main 线程的名字 = " +Thread.currentThread().getName() );
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程执行 i = " +i);
            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

