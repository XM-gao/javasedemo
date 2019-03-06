package com.neuedu.homework.three;

public class Company {
    public  static void print(ColaEmployee employee,int month){
        System.out.println("姓名为："+employee.getName()+",生日月份："+employee.getBirthdayMonth()+","
                +month+"份工资为："+employee.getSalary(month));
    }

}
