package com.neuedu.entity;

import java.util.Comparator;

public class MyComparator  implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAge()-o1.getAge();
    }
}
