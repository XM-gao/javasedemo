package com.neuedu.Example;

public class Rectangle extends Shape {
    private  int width;
    private int height;
    public  Rectangle(){}
    public Rectangle(int height,int width,String color){
        super(color);
        this.height=height;
        this.width=width;
    }
    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPer() {
        return (height+width)*2;
    }

    @Override
    public void showAll() {
        System.out.printf("矩形周长为%.2f，面积%.2f，颜色是%s",getPer(),getArea(),super.getColor());
    }
}
