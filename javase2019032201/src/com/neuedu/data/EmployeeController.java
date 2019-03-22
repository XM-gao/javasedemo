package com.neuedu.data;

import com.neuedu.util.SQLUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeController {
    public static void main(String[] args) {
        /*deleteupdate();*/
        List<Integer> ids=new ArrayList<>();
        ids.add(303);
        ids.add(302);
        ids.add(301);
        deleteBatch(ids);
    }
    public static void deleteBatch(List<Integer> ids){
        Connection connection=null;
        PreparedStatement pstm=null;
       // Statement statement=null;
        connection= SQLUtil.getConn();
        String sql="delete from employees where employee_id=?";
        //String sql2="delete from employees where employee_id=301 or 1=1 ";
        try {
            connection.setAutoCommit(false);
            pstm=connection.prepareStatement(sql);
            //statement=connection.createStatement();

            for(int i=0;i<ids.size();i++){
                pstm.setObject(1,ids.get(i));
                pstm.addBatch();//增加到批量
            }

            pstm.executeBatch();//批量的执行
            //statement.executeUpdate(sql2);
            connection.commit();


        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            SQLUtil.close(pstm,connection);
        }


    }




    public static void deleteupdate(){
        Connection connection=null;
        PreparedStatement pstm=null;
        PreparedStatement pstm2=null;
        connection= SQLUtil.getConn();
        String sql="delete from employees where id=302";
        String sql2="update employees set salary=8888 where employee_id=206";

        try {
            connection.setAutoCommit(false); //设置手动提交
            pstm2=connection.prepareStatement(sql2);
            pstm=connection.prepareStatement(sql);

            pstm2.executeUpdate();
            pstm.executeUpdate();

           connection.commit();//如果上面没有问题手动提交
        } catch (SQLException e) {
            try {
                connection.rollback();//如果有问题进行回滚
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            SQLUtil.close(pstm,pstm2,connection);
        }


    }
}
