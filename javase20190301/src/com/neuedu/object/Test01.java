package com.neuedu.object;

public class Test01 {
    public static void main(String[] args) {
        Function01 function01=new Function01();

        /**
         * 方法调用--无参无返回值
         */
        function01.eat1();

        System.out.println("--------------------");
        /**
         * 方法调用--无参有返回值
         */
        String dj=function01.eat2();
        /**
         * 方法调用--有参有返回值
         */
        String c=function01.eat3("土豆丝");
        System.out.println(dj+"   "+c);

        System.out.println("--------------------");
        /**
         * 方法调用--有参无返回值
         */
        function01.eat4("红烧鱼");


    }
    /**
     *   方法的定义：
     *   返回类型|void   方法名(参数类型 参数名[,参数类型 参数名]){
     *       方法体：
     *       void：无返回
     *       返回类型：return  值；（和返回类型对应）
     *   }
     *
     *   方法调用：
     *   1：谁来调用：----对象
     *   2：调用什么：----方法
     *   3：怎么使用：---有没有返回值，需不要参数
     *
     */
}
