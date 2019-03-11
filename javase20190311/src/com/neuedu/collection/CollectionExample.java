package com.neuedu.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class CollectionExample {
    /**
     * 问题：1：存放的数据类型不是单一的
     *       2：长度不定
     *
     *    集合：存放不同的数据类型的数据；长度不是固定
     *       Collection单列值---》Set===》HashSet:底层：hash进行存储，可以为null,线程不安全
     *                              TreeSet：底层：红黑树,不可以为null，线程不安全
     *                               等
     *                         1：数据的存放顺序和输出的顺序是不一样的，----无序
     *                         2：不允许存放重复数据
     *
     *                      List===》ArrayList ：底层数组形式，理论上，有利于查找，但不利于进行增，删，改操作。
     *                               LinkedList ：底层：链表 存储，  理论上，有不利于查找，但利于进行增，删，改操作。
     *                              等
     *                              为什么一般使用的时候，插入数据ArrayList比LinkedList的速度快？？？--尾部插入数据
     *
     *
     *                         1：数据的存放顺序和输出的顺序是一样的，----有序
     *                         2：允许存放重复数据
     *
     *     Map：键值对：key、value  ===》HashTable
     *                                   HashMap
     *                                   TreeMap等
     */



}
