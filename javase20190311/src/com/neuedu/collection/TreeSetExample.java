package com.neuedu.collection;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        /**
         * implements Comparable:自然排序，内部排序
         *
         *   Comparator   ：外部排序
         */
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("赵");
        treeSet.add("安");
        treeSet.add("草");
        treeSet.add("里");
        treeSet.add("六");
//        treeSet.add(null);
        System.out.println(treeSet);
    }
}
