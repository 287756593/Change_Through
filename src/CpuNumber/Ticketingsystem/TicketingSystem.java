package CpuNumber.Ticketingsystem;


/**
 * @projectName: Change _Through
 * @package: CpuNumber.Ticketingsystem
 * @className: Ticketingsystem
 * @author: 薛淮予
 * @description: 用多线程实现 3个窗口同时售票
 * @date: 2022/11/17 10:16
 * @version: 1.0
 */
public class TicketingSystem {
    public static void main(String[] args) {
        TicketOffice_01 office01 = new TicketOffice_01();
        Thread thread00 = new Thread(office01);
        Thread thread01 = new Thread(office01);
        Thread thread02 = new Thread(office01);
        thread00.start();
        thread01.start();
        thread02.start();

    }

    static int SurplusTicket = 323;
    //默认有100张车票

    static class TicketOffice_01 implements Runnable {
       static int count = 0;

        @Override
        public void run() {
            while (true) {

                if (SurplusTicket <= 0) {
                    System.out.println("售票厅" + Thread.currentThread().getName() + " 一共售票" + count + "张");
                    break;
                }
                System.out.println("售票厅 " + Thread.currentThread().getName() + "出售一张票 剩余车票 = " + SurplusTicket);
                SurplusTicket--;
                count++;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}



                                    