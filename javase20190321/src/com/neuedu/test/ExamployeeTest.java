package com.neuedu.test;

import com.neuedu.controller.EmployeeController;
import com.neuedu.entity.Employees;

import java.math.BigDecimal;
import java.util.List;

public class ExamployeeTest {
    public static void main(String[] args) {
    /* List<Employees> lists=   EmployeeController.getAll();
     for(Employees e:lists){
         System.out.println(e);
     }*/

    Employees employees=new Employees();
    employees.setEmployee_id(301);
    employees.setFirst_name("zhang");
    employees.setLast_name("san");
   employees.setSalary(new BigDecimal(7800));
    int n=EmployeeController.update(employees);
        System.out.println("影响的行数："+n);
    }
}
