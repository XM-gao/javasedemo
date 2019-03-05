package com.neuedu.interface01;

public class Test {
    public static void main(String[] args) {
        Animal animal=new Dog();//只能使用非抽象类的子类实例化
        animal.eat();

        //作业：什么时候使用抽象类，什么时候使用接口
    }
}
