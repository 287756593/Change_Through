package Interface.monkey;

/**
 * @projectName: Change _Through
 * @package: Interface.monkey
 * @className: Monkey
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/13 11:16
 * @version: 1.0
 */
public class Monkey {
    String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void jump() {
        System.out.println(name + "会跳");
    }

}

class LittleMonkey extends Monkey implements fish {

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(this.name + "经过了学习 可以像鱼一样的游泳了！");
    }
}

class test {
    public static void main(String[] args) {
        LittleMonkey XiaoWukong = new LittleMonkey("小悟空");
        XiaoWukong.jump();
        XiaoWukong.swimming();
    }
}

interface fish {
    void swimming();
}