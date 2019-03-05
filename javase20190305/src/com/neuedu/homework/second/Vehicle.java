package com.neuedu.homework.second;

public class Vehicle {
    private String brand;
    private String color;
    private double speed=0.0;

   public Vehicle(){}
   public Vehicle(String brand,String color){
        this.brand=brand;
        this.color=color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(this.brand==null) {//当brand有值时，不赋值
            this.brand = brand;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void run(){
        System.out.println("汽车品牌是："+brand+"汽车颜色："+color+",速度："+speed);
    }
}
