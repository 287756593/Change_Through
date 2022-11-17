package LingQianTong;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 薛淮予
 */
public class Money {
    /* 这个类是钱 思考一下 用什么方法记录 数组？ 链表？
    数组优点 查询方便 缺点 占用内存空间过大 new好空间后 不好扩展
    链表优点 扩展方便 缺点 不好查询 不好写（不是他的原因 是我自己菜）
     */
    static double TheBalanceOf = 0;
    /* 采用静态变量 记录余额 */

   static String[] strData = new String[150];
    /*可以记录150条消费记录*/

    static int i = 0;

    private String time() {
        /**
         * 时间戳
         */
        long times = System.currentTimeMillis();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy年-MM月dd日-HH时mm分ss秒");
        Date date = new Date(times);
        return dateFormatter.format(date);
    }

    /**
     * add 添加余额
     */
    public void add() {
        System.out.println("请输入充值多少余额:");
        double temp = new Scanner(System.in).nextDouble();
        TheBalanceOf += temp;
        // long times = System.currentTimeMillis();

        Paylist(time() + "\t成功充值" + temp + "当前剩余余额为：" + TheBalanceOf);
        System.out.println(time() + "\t成功充值" + temp + "当前剩余余额为：" + TheBalanceOf);
    }
    /*时间戳 ， 金额 ， next域*/

    public void Paylist(String str) {
        /**
         * 记录金额数据
         */
        strData[i] = str;
        i++;
    }

    public void Pay() {
        System.out.println("输入消费多少元:");
        double temp = new Scanner(System.in).nextDouble();
        if (temp > TheBalanceOf) {
            System.out.println("您的余额不足 无法消费");
        } else {
            TheBalanceOf -= temp;
            Paylist(time() + "\t消费成功" + temp + "当前剩余余额为：" + TheBalanceOf);
            System.out.println(time() + "\t消费成功" + temp + "当前剩余余额为：" + TheBalanceOf);
        }
    }
    public void show(){
        if (strData[0] == null){
            System.out.println("您当前没有零钱记录");
        }
        for (int j = 0; j < strData.length; j++) {
            if (strData[j] != null){
                System.out.println(strData[j]);
            }else {
                break;
            }
        }
    }

}
