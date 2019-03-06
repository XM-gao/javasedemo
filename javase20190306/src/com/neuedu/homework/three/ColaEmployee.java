package com.neuedu.homework.three;

public abstract class ColaEmployee {
    //包含的两个属性
    private String name;
    private int birthdayMonth;
    //使用构造器传值
    public  ColaEmployee(String name,int birthdayMonth){
        this.name=name;
        this.birthdayMonth=birthdayMonth;
    }
    public  int getBirthdayMonth(){
        return birthdayMonth;
    }

    public String  getName(){
        return name;
    }
    //计算工资方法

    public abstract double getSalary(int birthdayMonth);
}
