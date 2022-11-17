package FlnalTest;

/**
 * @projectName: Change _Through
 * @package: FlnalTest
 * @className: PI
 * @author: 薛淮予
 * @description: 圆周率
 * @date: 2022/11/8 08:26
 * @version: 1.0
 */
public class PI {
   private static final double pi = 3.1415926;

    public static double PI(double r) {
        return r * pi;
    }
}
class test{
    public static void main(String[] args) {
        System.out.println(PI.PI(4));
    }
}

class dome2{
    public dome2() {
    }
    public static int fun(final int x){
       // ++x;
        return x + 1;
    }
}