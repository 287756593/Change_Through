package demo;

/**
 * @projectName: Change _Through
 * @package: demo
 * @className: test
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/4 08:48
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        new stu(" 小明");
        new stu(" 小王");
        new stu(" 小张");
    }
}
class stu{
    public stu(String name) {
        System.out.println("大家好，我是" + name);
    }
}