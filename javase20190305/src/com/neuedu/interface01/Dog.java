package com.neuedu.interface01;

public class Dog  implements Animal {
    //子类实现接口：使用implements 关键词
    @Override
    public void eat() {
        System.out.println("" +
                "骨头");
    }

    @Override
    public void sleep() {

    }
}
