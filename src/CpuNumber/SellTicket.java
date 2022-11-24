package CpuNumber;

/**
 * @projectName: Change _Through
 * @package: CpuNumber
 * @className: SellTicket
 * @author: 薛淮予
 * @description: 3个线程同时售票 + 锁 Synchronized
 * @date: 2022/11/22 11:40
 * @version: 1.0
 */
public class SellTicket implements Runnable {
    static int count = 999999999;
    private Boolean loop = true;

    private synchronized void shell() {
        if (count <= 0) {
            System.out.println("车票已售光");
            loop = false;
            return;
        } else {
            System.out.println("柜台 = " + Thread.currentThread().getName() + "出售一张车票 剩余车票 = " + (--count));
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }

    @Override
    public void run() {

        //一共有900张票
        while (loop) {
            shell();
        }
    }
}

class test002 {
    public static void main(String[] args) {
        SellTicket sellTicket01 = new SellTicket();
        new Thread(sellTicket01).start();
        new Thread(sellTicket01).start();
        new Thread(sellTicket01).start();
        new Thread(sellTicket01).start();
        new Thread(sellTicket01).start();
        new Thread(sellTicket01).start();




    }
}