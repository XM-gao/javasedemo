package com.neuedu.encapsulation.first;

public class Person {
    /**
     * 成员变量不赋值，有默认值
     *  类：null
     *  int ：0
     *  boolean：false
     *  double：0.0
     */
   private String name;//成员变量
   private int age;
   private String addresss;

    /**
     * 构造器：或者构造方法，构造函数
     *   特殊的方法： 第一：没有返回类型
     *                第二：方法名与类名相同
     *   没有写构造器：默认构造器   public Person(){}
     *    只要写了有参的构造器，则默认构造器失效
     *    构造器，使用重载
     */
    public Person(){}
    public Person(String name){//局部变量
        this.name=name; //this：本类对象,调用成员变量
    }
    public Person(String name, int age){
        this(name);//this()  :本类构造器：放在第一行
        this.age=age;
    }

    public  void print(){
        System.out.println(name);
    }

}
