package Interface.demo01;

/**
 * @projectName: Change _Through
 * @package: Interface.demo01
 * @className: SqlServer
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/10 11:09
 * @version: 1.0
 */
public class SqlServer implements Api {
    @Override
    public void open() {
        System.out.println("打开 SqlServer");
    }

    @Override
    public void close() {
        System.out.println("关闭 SqlServer");
    }
}
