package com.neuedu.homework.three;

public class SalariedEmployee extends ColaEmployee {
     private double salary;

     public SalariedEmployee(String name,int birthdayMonth,double salary){
         super(name,birthdayMonth);
         this.salary=salary;
     }


    @Override
    public double getSalary(int birthdayMonth) {
         if(super.getBirthdayMonth()==birthdayMonth){
             return salary+100;
         }
        return salary;
    }
}
