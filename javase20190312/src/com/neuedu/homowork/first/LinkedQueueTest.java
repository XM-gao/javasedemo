package com.neuedu.homowork.first;

public class LinkedQueueTest {
    public static void main(String[] args) {
        LinkedQueue linkedQueue=new LinkedQueue();
       /* System.out.println(linkedQueue.isEmpty());*/
       linkedQueue.put(45);
       linkedQueue.put("aaa");
       linkedQueue.put(12);
       for(;;) {
           if(linkedQueue.isEmpty()){
               break;
           }
           System.out.println(linkedQueue.get());
       }

    }
}
