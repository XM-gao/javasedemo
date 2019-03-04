package com.neuedu.function.constructor;

public class Test {
    public static void main(String[] args) {
        /**
         * 构造器的作用：1：实例化对象 new
         *               2：对于有参构造器来说，给成员变量赋值
         */
        Person person=new Person("tom");
        System.out.println(person.name);
    }
}
