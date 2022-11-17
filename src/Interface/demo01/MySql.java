package Interface.demo01;

/**
 * @projectName: Change _Through
 * @package: Interface.demo01
 * @className: MySql
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/10 11:07
 * @version: 1.0
 */
public class MySql implements  Api {
    @Override
    public void open() {
        System.out.println("打开MySql");
    }

    @Override
    public void close() {
        System.out.println("关闭MySql");
    }
}
