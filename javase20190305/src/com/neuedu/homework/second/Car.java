package com.neuedu.homework.second;

public class Car extends  Vehicle{
    private int loader;
   public  Car(String brand,String color,int loader){
        super(brand,color);
        this.loader=loader;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("承载人数："+loader);
    }
}
