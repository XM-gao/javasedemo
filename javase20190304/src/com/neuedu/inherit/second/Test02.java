package com.neuedu.inherit.second;

public class Test02 {
    public static void main(String[] args) {
        /**
         *  1：使用子类定义父类--自动转换的 ，这种转换形式叫做向上转型
         *  2：使用父类定义子类---前提：子类先定义父类
         *            --强制转换： Teacher teacher=(Teacher) person;
         *            这种转换形式叫做向下转型
         */
        Person person=new Teacher();//使用子类定义父类的时候，重写父类中的方法，
                                    // 在调用此方法的时候，显示的是子类的方法中的功能
        person.setName("张三");
        System.out.println(person);
        person.eat();


        Teacher teacher=(Teacher) person;
        System.out.println(teacher);

        //判断teacher是否是Teacher的对象  关键字：instanceof  ，左边是对象，右边类，目的：判断对象是不是右边类的对象
        //如果这个对象是子类的对象，那么也是父类的对象
        boolean flag=teacher instanceof Person;
        System.out.println(flag);

    }
}
