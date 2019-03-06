package com.neuedu.homework.three;

public class Test {
    public static void main(String[] args) {
        ColaEmployee[] employees=new ColaEmployee[2];
        employees[0]=new SalariedEmployee("tom",7,8000);
        employees[1]=new HourlyExmployee("lili",5,200,25);
        for (ColaEmployee employee:employees){
            Company.print(employee,5);
        }
    }
}
