package LingQianTong;

import java.util.Scanner;

/**
 * @author 薛淮予
 * @time 2022-10-17-22:01
 */
public class Exit {
    //4。退出系统

    public Exit() {
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
