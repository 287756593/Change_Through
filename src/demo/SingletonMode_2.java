package demo;

/**
 * @projectName: Change _Through
 * @package: demo
 * @className: SingletonMode_2
 * @author: 薛淮予
 * @description: 单例模式——懒汉式
 * @date: 2022/11/6 20:15
 * @version: 1.0
 */
public class SingletonMode_2 {

}

class Cat {
    private String name;

    private Cat(String name) {
        this.name = name;
        System.out.println("GirFriend已经实例化");
    }
//
//    public static Cat getInstanceCat(){
//        if (Cat == null){
//             Cat cat = new Cat("狗子");
//        }
//        return cat
//    }

    public static int n = 999;
}