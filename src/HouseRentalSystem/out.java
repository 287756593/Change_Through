package HouseRentalSystem;

import java.util.Scanner;

/**
 * @projectName: Change _Through
 * @package: HouseRentalSystem
 * @className: out
 * @author: 薛淮予
 * @description: 退出程序
 * @date: 2022/10/19 09:18
 * @version: 1.0
 */
public class out {
    //4。退出系统

    public out() {
        /* 判断是否退出系统 输入y 为退出*/
        System.out.println("如果需要退出请输入'y'");
        String t =new Scanner(System.in).next();
        /* 匿名函数 用于输入确认退出命令*/
        if (t == "y" || t == "Y"){
            System.out.println("再见");
            System.exit(0);
        }

    }
}
