package com.neuedu.encapsulation.second;

public class Test {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("max");

        person.setAge(56);
        /**
         * 使用toString()
         *   直接使用对象名，或者使用对象名.toString();
         */
        System.out.println(person);
    }
}
