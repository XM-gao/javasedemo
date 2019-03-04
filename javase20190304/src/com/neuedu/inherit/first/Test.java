package com.neuedu.inherit.first;

public class Test {
    public static void main(String[] args) {
        Person  person=new Person();
        person.setName("tom");
        System.out.println(person);

        System.out.println("************************");

        Teacher teacher=new Teacher();
        teacher.setName("lili");
        teacher.setSalary(5000);
        System.out.println(teacher);
    }
}
