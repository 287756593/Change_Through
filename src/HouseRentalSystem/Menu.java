package HouseRentalSystem;

import java.util.Date;
import java.util.Scanner;

/**
 * @projectName: Change _Through
 * @package: HouseRentalSystem
 * @className: Menu
 * @author: 薛淮予
 * @description: 菜单 
 * @date: 2022/10/19 09:04
 * @version: 1.0
 */
public class Menu {
    public Menu() {
        while (true) {
            System.out.println("************房屋出租系统************");
            System.out.println("\t1.新增房源");
            System.out.println("\t2.查找房源");
            System.out.println("\t3.删除房源");
            System.out.println("\t4.修改房屋信息");
            System.out.println("\t5.房屋列表");
            System.out.println("\t6.退出");
            GO();
        }
    }

    private void GO() {
        /**
         * @param :
         * @return void
         * @author 薛淮予
         * @description 用 switch case 判断 需要执行的的代码
         * @date 2022/10/19 09:15
         */
        System.out.println("输入选项 1- 6");
        int temp = new Scanner(System.in).nextInt();
        if (!(temp >= 1 && temp <= 6)) {
            System.out.println("输入错误 请重新输入");
            GO();
        }
        switch (temp) {
            case 1:
                new Data().added();
                break;
            case 2:
                new Data().Lookup();
                break;
            case 3:
                new Data().Delete();
                break;
            case 4:
                System.out.println("功能以后在写");
                break;
            case 5:
                new Data().show();
                break;
            case 6:
                new out();
                break;
            default:
                break;
        }
    }
}
