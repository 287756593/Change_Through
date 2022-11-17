package LingQianTong;

import java.util.Scanner;

/**
 * @author 薛淮予
 * @time 2022-10-17-22:01
 */
public class Menu {


    public Menu() {
        /*零钱通菜单 */
        System.out.println("**************零钱通菜单**************");
        System.out.println("\t\t1.零钱收入");
        System.out.println("\t\t2.收益入账");
        System.out.println("\t\t3.消  费");
        System.out.println("\t\t4.退  出");
        GO();
    }

    /**
     * 首先我们完成了系统的菜单 现在需要跟着菜单进行具体内容实现 使用面向对象
     */
    private void GO() {
        while (true) {
            System.out.println("请您输入选项:");
            int number = new Scanner(System.in).nextInt();
            if (!(number > 0 && number <= 4)) {
                System.out.println("数值错误 请重新输入");
                GO();
            }
            switch (number) {
                case 1:
                    new Money().add();
                    break;
                case 2:
                    new Money().show();
                    break;
                case 3:
                    new Money().Pay();
                    break;
                case 4:
                    new Exit();
                    /* 选项4完成 */
                    break;
                default:
                    break;
            }
        }
    }
}
