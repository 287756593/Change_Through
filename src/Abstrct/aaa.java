package Abstrct;

/**
 * @projectName: Change _Through
 * @package: Abstrct
 * @className: time
 * @author: 薛淮予
 * @description: 计算时间
 * @date: 2022/11/9 12:31
 * @version: 1.0
 */
public class aaa extends father {
//    @Override
//    public void calculationTime() {
//        super.calculationTime();
//    }

    @Override
    public void job() {
        long count = 100;
        for (long i = 1; i < 9999999; i++) {
            count *= i;
            count /= 4;
        }

    }
}

class bbb extends father {
//    public void calculationTime() {
//        super.calculationTime();
//    }

    @Override
    public void job() {
        long count = 100;
        for (long i = 1; i < 9999999; i++) {
            count *= i;
            count /= 4;
        }

    }
}

class ccc extends father {
//    @Override
//    public void calculationTime() {
//        super.calculationTime();
//
//    }

    @Override
    void job() {
        long count = 100;
        for (long i = 1; i < 9999999; i++) {
            count *= i;
            count /= 4;
        }
    }
}

abstract class father extends Thread{
    abstract void job();

    public void calculationTime() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println("任务执行时间 = " + (end - start));

    }

}

class test001 {
    /**
     * @param args:
     * @return null
     * @author 薛淮予
     * @description 测速类
     * @date 2022/11/9 12:31
     */

    public static void main(String[] args) {
        new ccc().calculationTime();
//        new bbb().calculationTime();
//        new aaa().calculationTime();
    }
}
