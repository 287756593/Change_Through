package Abstrct;

/**
 * @projectName: Change _Through
 * @package: Abstrct
 * @className: demo1
 * @author: 薛淮予
 * @description: TODO
 * @date: 2022/11/8 08:58
 * @version: 1.0
 */
public abstract class demo1 {
    //思考：这里eat 这里你实现了，其实没有什么意义
    //即：父类方法不确定性的间题
    //===＞ 考虑将该方法设计为抽象 (abstract)方法
    //===> 所謂抽象方法就是没有安現的方法
    //===> 所谓没有实现就是指，没有方法体
    //===＞ 当一个类中存在抽象方法时，需要将该类声明为abstract类

    public abstract void eat(); /*不实现该方法 可以用 abstract 修饰这个方法 方法的实现由子类完成*/


}
