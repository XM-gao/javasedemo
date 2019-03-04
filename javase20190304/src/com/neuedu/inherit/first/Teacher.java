package com.neuedu.inherit.first;

public class Teacher extends Person {
    private int salary;

    public Teacher(){
        super();//调用父类的构造器：无参构造器
        System.out.println("teacher");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+", salary='" + salary + '\'';//super：父类一个对象，调用父类中的非私有变量和方法
    }
}
