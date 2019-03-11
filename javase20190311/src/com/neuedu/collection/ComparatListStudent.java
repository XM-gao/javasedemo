package com.neuedu.collection;

import com.neuedu.entity.MyComparator;
import com.neuedu.entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatListStudent  {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        Student student=new Student();
        student.setId(12333);
        student.setName("tom");
        student.setAge(24);
        student.setSex("男");
        student.setAddress("天津");

        list.add(student);

        Student student1=new Student();
        student1.setId(12334);
        student1.setName("lili");
        student1.setAge(20);
        student1.setSex("女");
        student1.setAddress("保定");

        list.add(student1);

        Student student2=new Student();
        student2.setId(12334);
        student2.setName("lili");
        student2.setAge(21);
        student2.setSex("女");
        student2.setAddress("保定");

        list.add(student2);

        System.out.println(list);

       /* Collections.sort(list);*///自然排序
       Collections.sort(list,new MyComparator());
        System.out.println(list);

    }
}
