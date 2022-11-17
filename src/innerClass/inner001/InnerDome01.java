package innerClass.inner001;

import java.util.Scanner;

/**
 * @projectName: Change _Through
 * @package: innerClass.inner001
 * @className: innerDome01
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/14 20:25
 * @version: 1.0
 */
public class InnerDome01 {
    public InnerDome01() {

    }

    private String name;
    private int age;

    private int n = 100;

    private void show(String name, int age) {
        System.out.println("我叫" + name + " 今年" + age + "岁了");
    }

    class Inner01 {
        public void go() {
            Scanner input = new Scanner(System.in);
            name = input.next();
            age = input.nextInt();
            show(name, age);
        }

        int n = 900;

        public void test_1() {
            System.out.println("内部类 n=" + n + " 外部类 n = " + InnerDome01.this.n);
        }
    }

    class Inner02 extends Inner01 {
        @Override
        public void go() {
            super.go();
        }
    }

    Inner02 inner02 = new Inner02();
    Inner01 inner01 = new Inner01();

}

class test {
    public static void main(String[] args) {
        InnerDome01 dome01 = new InnerDome01();
        dome01.inner01.test_1();

    }
}