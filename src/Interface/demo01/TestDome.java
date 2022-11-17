package Interface.demo01;

/**
 * @projectName: Change _Through
 * @package: Interface.demo01
 * @className: TestDome
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/13 19:47
 * @version: 1.0
 */
public class TestDome extends ccc implements bbb{
    public static void main(String[] args) {
        System.out.println(bbb.x);
    }
}

interface bbb {
    int x = 2;
}
class ccc {
    public static int x =0;
}