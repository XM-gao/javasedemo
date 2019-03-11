package com.neuedu.collection;

import com.neuedu.entity.MyComparator;
import com.neuedu.entity.Student;

import java.util.TreeSet;

public class StudentTreeSet {
    public static void main(String[] args) {

        /*TreeSet<Student> treeSet=new TreeSet<>();*/
        TreeSet<Student> treeSet=new TreeSet<>(new MyComparator());
        Student student=new Student();
        student.setId(12333);
        student.setName("tom");
        student.setAge(20);
        student.setSex("男");
        student.setAddress("天津");

        treeSet.add(student);

        Student student1=new Student();
        student1.setId(12334);
        student1.setName("lili");
        student1.setAge(23);
        student1.setSex("女");
        student1.setAddress("保定");

        Student student2=new Student();
        student2.setId(12345);
        student2.setName("zhang");
        student2.setAge(24);
        student2.setSex("女");
        student2.setAddress("保定");

        treeSet.add(student1);
        treeSet.add(student2);
        /*System.out.println(treeSet);*/
        for(Student s:treeSet) {
            System.out.println(s);
        }
    }
}
