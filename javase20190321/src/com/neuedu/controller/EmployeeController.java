package com.neuedu.controller;

import com.neuedu.entity.Employees;
import com.neuedu.util.SqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeController {
    /**
     * 是将所有的数据提取，放入集合list对象中
     * @return
     */
    public static List<Employees> getAll(){
        Connection connection=null;
        PreparedStatement pstm=null;
        ResultSet rs=null;
        List<Employees> lists=new ArrayList<>();

        connection= SqlUtil.getConn();

        String sql="select * from employees";

        try {
            pstm=connection.prepareStatement(sql);
            rs=pstm.executeQuery();
            while(rs.next()){
                Employees e=new Employees();
                e.setEmployee_id(rs.getInt("employee_id"));
                e.setFirst_name(rs.getString("first_name"));
                e.setLast_name(rs.getString("last_name"));
                e.setEmail(rs.getString("email"));
                e.setSalary(rs.getBigDecimal("salary"));
                e.setHire_date(rs.getDate("hire_date"));
                e.setJob_id(rs.getString("job_id"));
                e.setPhone_number(rs.getString("phone_number"));
                e.setDepartment_id(rs.getInt("department_id"));
                e.setManager_id(rs.getInt("manager_id"));

                lists.add(e);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            SqlUtil.close(rs,pstm,connection);
        }
        /*
        * 没有数据的时候返回null
        * */
        if(lists==null|| lists.size()==0){
            return null;
        }

        return lists;

    }

    /**
     * 使用拼接的形式书写sql语句
     * @param emp
     * @return
     */
    public static int update(Employees emp){
        List<Object> listo=new ArrayList<>();
        String sql=getSql(emp,listo);
        System.out.println(sql);
        System.out.println(listo);

       Connection connection=null;
       PreparedStatement pstm=null;
       int n=-1;
       connection=SqlUtil.getConn();
        try {
            pstm=connection.prepareStatement(sql);
            SqlUtil.insertValuesToPreparedStatement(pstm, listo.toArray());

           n=pstm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return n;
    }
   /*private static Object[] listToArray(List<Object> listo){
        Object[] objs=new Object[listo.size()];
        for(int i=0;i<listo.size();i++){
            objs[i]=listo.get(i);
        }
        return objs;
   }*/


    private static String getSql(Employees emp,List<Object> listo){
        String sql="update employees set ";
        //1:sql语句格式的拼接
        //2:数据拼接--   List<Object> listo=new ArrayList<>();存放数据的


        if(emp.getFirst_name()!=null){
            sql+="first_name=?,";
            listo.add(emp.getFirst_name());
        }
        if(emp.getLast_name()!=null){
            sql+="last_name=?,";
            listo.add(emp.getLast_name());
        }
        if(emp.getEmail()!=null){
            sql+="email=?,";
            listo.add(emp.getEmail());
        }
        if(emp.getSalary()!=null){
            sql+="salary=?,";
            listo.add(emp.getSalary());
        }
        sql=sql.substring(0,sql.length()-1);
        /*System.out.println(sql);*/
        sql+=" where employee_id=?";
        listo.add(emp.getEmployee_id());
        return sql;
    }


}
