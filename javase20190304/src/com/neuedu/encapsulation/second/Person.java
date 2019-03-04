package com.neuedu.encapsulation.second;

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
   //赋值
    public void  setName(String name){
        this.name=name;
    }
    //取值
    public String getName(){
        return name;
    }
/**
 *  alt+insert 或者
 *  alt+insert+fn
 */
    public int getAge() {
        return age;
    }

    /**
     * 添加一些限制或者其他的操作，方便后面代码的使用
     * @param age
     */
    public void setAge(int age) {
        if(age<18){
            this.age=0;
        }
        this.age = age;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    /**
     * 重写的父类中的toString方法
     * @return
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addresss='" + addresss + '\'' +
                '}';
    }
}
