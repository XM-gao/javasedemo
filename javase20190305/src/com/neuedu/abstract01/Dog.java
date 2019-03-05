package com.neuedu.abstract01;

public class Dog extends Animal{
    /**
     * 子类继承抽象类，必须实现抽象方法的重写
     */
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    @Override
    public void sleep() {

    }
}
