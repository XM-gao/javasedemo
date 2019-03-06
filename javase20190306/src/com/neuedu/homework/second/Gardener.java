package com.neuedu.homework.second;

public class Gardener {
    public static Fruit create(String name){
        if("苹果".equals(name)){
            return  new Apple();
        }else if("梨".equals(name)){
            return  new Pear();
        }else if("橘子".equals(name)){
            return  new Orange();
        }
        return null;
    }
}
