package com.neuedu.static01;

public class Test {
    public static void main(String[] args) {

        StaticExample01 example02=new StaticExample01();
        example02.age++;
        StaticExample01.height++;
        System.out.println("age:"+example02.age+"   height:"+example02.height);
        System.out.println("************************");
        StaticExample01 example01=new StaticExample01();

        example01.age++;
        example01.height++;
        System.out.print("age:"+example01.age+"   height:"+example01.height);
    }
}
