package com.neuedu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
    public static void main(String[] args) {
        List list=new ArrayList<>();

        list.add(34);//存放的类--Integer对象
        list.add("hello");
        list.add("hello");

        System.out.println(list);

        System.out.println("****************************");
       for(int i=0;i<list.size();i++){//list.size()，数的个数
           System.out.print(list.get(i)+"  ");
       }
        System.out.println("\n****************************");

        for (Object o:list) {//现在的数据类型，不是一种，而是多种
            System.out.print(o+"    ");
        }

        System.out.println("\n****************************");

        Iterator iterable=list.iterator();
        while(iterable.hasNext()){
            System.out.print(iterable.next()+"  ");
        }
        System.out.println("\n================================");
        ListIterator iterator=list.listIterator();
        System.out.println("从前往后：");
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"  ");
        }

        System.out.println("\n================================");
        System.out.println("从后往前：");
        while(iterator.hasPrevious()){
            System.out.print(iterator.previous()+"  ");
        }

    }
}
