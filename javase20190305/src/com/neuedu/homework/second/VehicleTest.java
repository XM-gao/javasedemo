package com.neuedu.homework.second;

public class VehicleTest {
    public static void main(String[] args) {
        /*Vehicle vehicle=new Vehicle("大众","red");*/
        Vehicle vehicle=new Vehicle();
        vehicle.setBrand("法拉利");
        vehicle.run();

        Car car=new Car("兰博基尼","black",2);
        car.run();
    }
}
