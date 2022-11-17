package Interface.demo002;

/**
 * @projectName: Change _Through
 * @package: Interface.demo002
 * @className: Oracle
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/12 18:29
 * @version: 1.0
 */
public class Oracle implements Interface01 {
    @Override
    public void open() {
        System.out.println("连接到Oracle");
    }

    @Override
    public void clouse() {
        System.out.println("与Oracle断开连接");
    }
}
