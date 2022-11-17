package Interface.demo002;

/**
 * @projectName: Change _Through
 * @package: Interface.demo002
 * @className: Sqlsever
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/12 18:32
 * @version: 1.0
 */
public class Sqlsever implements Interface01 {

    @Override
    public void open() {
        System.out.println("连接到Sqlsever");
    }

    @Override
    public void clouse() {
        System.out.println("与Sqlsever断开连接");
    }
}
