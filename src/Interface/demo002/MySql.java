package Interface.demo002;

/**
 * @projectName: Change _Through
 * @package: Interface.demo002
 * @className: MySql
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/12 18:23
 * @version: 1.0
 */
public class MySql implements Interface01{
    @Override
    public void open() {
        System.out.println("连接到MySql");
    }

    @Override
    public void clouse() {
        System.out.println("断开MySql连接");
    }
}
