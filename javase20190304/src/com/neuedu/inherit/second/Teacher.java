package com.neuedu.inherit.second;

public class Teacher extends Person {
    private int salary;

    public Teacher(){
        super();//调用父类的构造器：无参构造器
        System.out.println("teacher");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * 重写override
     *   功能重新定义
     *   特点：1:子类继承或者实现了父类
     *         2:方法名，参数和返回类型都保持一致
     */
    @Override
    public void eat() {
        System.out.println("吃麻辣烫");

    }

    @Override
    public String toString() {
        return super.toString()+", salary='" + salary + '\'';//super：父类一个对象，调用父类中的非私有变量和方法
    }
}
