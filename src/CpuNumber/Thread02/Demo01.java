package CpuNumber.Thread02;

/**
 * @projectName: Change _Through
 * @package: CpuNumber.Thread02
 * @className: Demo01
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/18 09:41
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        add add01 = new add();
        add add02 = new add();
        add add03 = new add();
        add add04 = new add();
        add add05 = new add();
        add add06 = new add();
        add add07 = new add();
        add add08 = new add();
        add add09 = new add();
        add add010 = new add();
        add add11 = new add();
        add add12 = new add();
        add add13 = new add();
        add add14 = new add();
        add add15 = new add();
        add add16 = new add();
        add add17 = new add();
        add add18 = new add();
        add add19 = new add();
        add add020 = new add();
        add01.start();
        add02.start();
        add03.start();
        add04.start();
        add05.start();
        add06.start();
        add07.start();
        add08.start();
        add09.start();
        add010.start();
        add11.start();
        add12.start();
        add13.start();
        add14.start();
        add15.start();
        add16.start();
        add17.start();
        add18.start();
        add19.start();
        add020.start();
    }
}

class add extends Thread {
    @Override
    public void run() {
        long count = 0;
        for (int i = 0; i < 99999999; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
        }
    }
}
