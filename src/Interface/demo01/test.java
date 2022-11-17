package Interface.demo01;

import org.jetbrains.annotations.NotNull;

/**
 * @projectName: Change _Through
 * @package: Interface.demo01
 * @className: test
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/10 11:10
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        MySql mySql = new MySql();
        Oracle oracle = new Oracle();
        SqlServer sqlServer = new SqlServer();
        test test = new test();
        test.go(mySql);
        test.go(oracle);
        test.go(sqlServer);
    }
    public void go(@NotNull Api api){
        api.open();
        api.close();
    }
}
