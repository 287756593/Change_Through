package demo;

/**
 * @projectName: Change _Through
 * @package: demo
 * @className: SingletonMode
 * @author: 薛淮予
 * @description: 单例模式-饿汉式
 * @date: 2022/11/4 08:41
 * @version: 1.0
 */
public class SingletonMode {
    public static void main(String[] args) {
        System.out.println(GirFriend.n);
    }
}

class GirFriend {
    private static GirFriend friend = new GirFriend("红红");
    private String name;

    private GirFriend(String name) {
        this.name = name;
        System.out.println("GirFriend已经实例化");
    }

//    public static GirFriend getGirend(){
//        GirFriend friend = new GirFriend("红红");
//        return friend;
//    }
    public static int n = 999;
}