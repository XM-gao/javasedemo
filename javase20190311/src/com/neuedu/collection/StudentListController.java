package com.neuedu.collection;

import com.neuedu.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentListController {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        Student student=new Student();
        student.setId(12333);
        student.setName("tom");
        student.setAge(20);
        student.setSex("男");
        student.setAddress("天津");

        list.add(student);

        Student student1=new Student();
        student1.setId(12334);
        student1.setName("lili");
        student1.setAge(24);
        student1.setSex("女");
        student1.setAddress("保定");

        list.add(student1);

        System.out.println(list.contains(student));
    }
}
