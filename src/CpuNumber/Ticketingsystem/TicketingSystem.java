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
        TicketingSystem ticketingSystem = new TicketingSystem();
        ticketingSystem.ticketOffice_01.start();
        ticketingSystem.ticketOffice_02.start();
        ticketingSystem.ticketOffice_03.start();
    }

    TicketOffice_01 ticketOffice_01 = new TicketOffice_01();
    TicketOffice_02 ticketOffice_02 = new TicketOffice_02();
    TicketOffice_03 ticketOffice_03 = new TicketOffice_03();
    static int SurplusTicket = 323;
    //默认有100张车票

    class TicketOffice_01 extends Thread {
        int count = 0;

        @Override
        public void run() {
            while (true) {
                if (SurplusTicket == 0) {
                    System.out.println("售票厅1 一共售票" + count + "张");
                    break;
                }
                System.out.println("售票厅1 出售一张票 剩余车票 = " + SurplusTicket);
                SurplusTicket--;
                count++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    class TicketOffice_02 extends Thread {
        int count = 0;

        @Override
        public void run() {
            while (true) {
                if (SurplusTicket == 0) {
                    System.out.println("售票厅2 一共售票" + count + "张");
                    break;
                }
                System.out.println("售票厅2 出售一张票 剩余车票 = " + SurplusTicket);
                SurplusTicket--;
                count++;
                try {
                    Thread.sleep(60);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

    class TicketOffice_03 extends Thread {
        @Override
        public void run() {
            int count = 0;

            while (true) {
                if (SurplusTicket == 0) {
                    System.out.println("售票厅3 一共售票" + count + "张");
                    break;
                }
                System.out.println("售票厅3 出售一张票 剩余车票 = " + SurplusTicket);
                SurplusTicket--;
                count++;

                try {
                    Thread.sleep(90);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}



                                    