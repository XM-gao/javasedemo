package com.neuedu.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set set=new HashSet<>();

        set.add(45);
        set.add("hello");
        set.add(null);

        System.out.println(set);

        System.out.println("************************************");

        for (Object o:set
             ) {
            System.out.print(o+"\t");
        }

        System.out.println("\n************************************");

        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }

    }
}
