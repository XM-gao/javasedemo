package com.neuedu.io.entity;

import java.io.Serializable;

public class Student implements Serializable {

   public static final long  serialVersionUID=1L;

    private  int id;
    private String name;
    public  Student(){}
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
