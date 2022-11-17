package Stu;

/**
 * &#064;projectName:  Change _Through
 * @package: Stu
 * @className: DaiMaKuai_Test
 * &author:  薛淮予
 * @description: 代码块dome
 * @date: 2022/10/20 10:43
 * @version: 1.0
 */
public class DaiMaKuai_Test {
    public static void main(String[] args) {
        new ddd();
       // int i = ddd.t;
    }
}
class aaa{
    int i = getI();
    static{
        System.out.println("aaa的静态代码块");
    }

    public aaa() {
        System.out.println("aaa 的 构造器");
    }

    public int  getI() {
        System.out.println("aaa的普通代码块");
        return 100;
    }
}

class ddd extends aaa{
    static int t = 0;

    public ddd() {
        System.out.println("构造器执行");
    }

    static {
        System.out.println("DDD 的静态代码块已启用");
    }

    static int num = getNum();

    {
        System.out.println("DDD 的代码块已启用");
    }

    private static int getNum() {
        System.out.println("静态 getNUM 的方法已启用");
        return 100;
    }


    public static int i = 999;
}