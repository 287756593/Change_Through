package Abstrct;

/**
 * @projectName: Change _Through
 * @package: Abstrct
 * @className: demo02
 * @author: 薛淮予
 * @description: 编写一个Employee类，声明为抽象类，包含如下三个属性：name, id, salary。
 * 提供必要的构造器和抽象方法：work0。对于Manager类来说，他既是员工，还曼有奖金(bonus)的属性。请使用继承的恩想，设计CommonEmployee类和
 * Manager类，要求类中提供必要的方法进行属性访问,实现work0，提示“经理/普通员工 名字 工作中.
 * @date: 2022/11/8 19:15
 * @version: 1.0
 */
public class demo02 {
    public static void main(String[] args) {
        CommonEmployee jack = new CommonEmployee("杰克", 888, 8000);
        jack.work0();
        Manager Bob = new Manager("鲍勃", 777, 12000, 12000);
        Bob.work0();

    }
}

abstract class Employee {
    String name;
    int id;
    double salary;  //薪资

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract void work0();
}

class Manager extends Employee {
    double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    void work0() {
        System.out.println("经理" + name + "正在工作中.......");
    }
}

class CommonEmployee extends Employee {
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    void work0() {
        System.out.println("员工" + name + "正在工作中.......");
    }
}