package Interface.demo01;

/**
 * @projectName: Change _Through
 * @package: Interface.demo01
 * @className: Oracle
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/10 11:08
 * @version: 1.0
 */
public class Oracle implements Api{
    @Override
    public void open() {
        System.out.println("打开Oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭Oracle");
    }
}
