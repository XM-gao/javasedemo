package com.neuedu.homowork.first;

import java.util.LinkedList;

public class LinkedQueue {//链表队列

    //创建对象
    private LinkedList queue;//私有属性

    public LinkedQueue(){
        queue=new LinkedList();//创建
    }

    public void put(Object o){
        queue.add(queue.size(),o);//对象的添加:从尾部添加
    }

    public Object get(){
        return queue.remove(0);//从头部提取
    }

    public boolean  isEmpty(){//判断是否为空

       return queue.size()==0;
    }
}

