package com.neuedu.test;

import com.neuedu.dao.EmployeesDAO;
import com.neuedu.dao.imple.EmployeesDAOImple;

public class Test {
    private static EmployeesDAO employeesDAO=new EmployeesDAOImple();

    public static void main(String[] args) {
        System.out.println(employeesDAO.getOne(198));
    }
}
