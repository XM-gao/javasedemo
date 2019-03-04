package com.neuedu.inherit.three;

public class Test {
    public static void main(String[] args) {
        /**  多态：通过调用同一方法或者行为，实现了不同的效果
         *   多态实现：1：子类继承或者实现父类
         *             2：子类重写父类的方法
         *             3：父类对象使用子类实例化
         */

        Person person=new Teacher();//赋值多态
        person.eat();

        Person person1=new Student();
        person1.eat();
    }
}
