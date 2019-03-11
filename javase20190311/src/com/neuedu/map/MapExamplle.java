package com.neuedu.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExamplle {
    public static void main(String[] args) {
        /**
         * key和value可以为null
         */
        Map<String ,String> map=new HashMap<>();
        map.put("1","Java");
        map.put("2","html");
        map.put("3","css");
        map.put("2","mysql");//覆盖原来值 key：唯一
        map.put(null,null);
        System.out.println(map);
        System.out.println("***************************");
        /**
         * 1:先得到key，再根据key得到value
         */
        Set<String> keys=map.keySet();//所有key的值
        /*System.out.println(keys);*/
        Iterator<String> iterator=keys.iterator();
        while(iterator.hasNext()){
            String key=iterator.next();
            System.out.println("key:"+key+",value:"+map.get(key));
        }
        System.out.println("****************************************");
        /**
         * 2:同时得到key和value
         *
         */
        Set<Map.Entry<String,String>> entries=map.entrySet();

        for(Map.Entry<String,String> e:entries){
            System.out.println("key:"+e.getKey()+",value:"+e.getValue());
        }

    }
}
