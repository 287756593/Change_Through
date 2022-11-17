package Interface.demo002;

import HouseRentalSystem.Menu;
import Interface.demo01.MySql;

/**
 * @projectName: Change _Through
 * @package: Interface.demo002
 * @className: test
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/12 18:32
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        MySql mySql = new MySql();
        Oracle oracle = new Oracle();
        Sqlsever sqlsever = new Sqlsever();
        test test1 = new test(oracle);
        //test test3 = new test(mySql);
        test test2 = new test(sqlsever);
        b B = new b();

        System.out.println(b.a);
        System.out.println(B.a);
        System.out.println(Interface01.a);
    }

    test(Interface01 interface01) {
        interface01.open();
        interface01.clouse();
        System.out.println();
    }
}

class b implements Interface01 {

    @Override
    public void open() {

    }

    @Override
    public void clouse() {

    }
}


