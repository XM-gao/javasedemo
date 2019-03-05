package com.neuedu.abstract01;

public class Test {
    /**
     * 抽象类： 使用是关键字abstract；
     *       抽象类只能使用子类实例化，不能使用自身类实现实例化
     *
     *     抽象类中，包含成员变量，非抽象方法，抽象方法
     *     注意：1:抽象类中可以没有抽象方法，但是抽象方法必须在抽象类中
     *    // 2:抽象方法：只定义了方法声明，包括返回类型，方法名，参数等信息，
     //        但是没有定义方法体
             3: 子类继承抽象类，必须实现抽象方法的重写
     * @param args
     */
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.eat();
     /*   Animal animal=new Animal();*/
    }
}
