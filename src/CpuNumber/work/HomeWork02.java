package CpuNumber.work;

/**
 * @projectName: Change _Through
 * @package: CpuNumber.work
 * @className: HomeWork02
 * @author: 薛淮予
 * @description: (1 ） 有2个用户分别从同一个卡上取钱 （ 总额 ： 10000 ）
 *( 2) 每次都取1000，当余额不足时，就不能取款了
 * （3）不能出现超取现象=》线程同步问题.
 * @date: 2022/11/24 11:31
 * @version: 1.0
 */
public class HomeWork02 implements Runnable {
    boolean Flap = true;
    static int money = 10000;
    synchronized void WithdrawalOfMoney(){
        if (money <= 0){
            System.out.println("余额 = " + money + " 无法取款");
            Flap = false;
            return;

        }
        money -= 1000;
        System.out.println(Thread.currentThread().getName() + "取走了1000块钱 剩余金额等于 = " + money);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void run() {
        while (Flap){
            WithdrawalOfMoney();
        }
    }
}

class test002{
    public static void main(String[] args) {
        HomeWork02 work02 = new HomeWork02();
        HomeWork02 work01 = new HomeWork02();
        new Thread(work01).start();
        new Thread(work02).start();

    }
}