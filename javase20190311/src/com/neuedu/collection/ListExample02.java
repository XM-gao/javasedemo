package com.neuedu.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample02 {
    public static void main(String[] args) {
        List list=new ArrayList<>();

        list.add(34);//存放的类--Integer对象
        list.add("hello");
        list.add("hello");

        System.out.println(list.contains(1));




    }
}
