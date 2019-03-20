package com.neuedu.dataconnection;

import com.neuedu.util.SqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExample {
    public static void main(String[] args) {
        /*
         * 1：加载驱动
         * 2:进行连接数据库
         *    1）使用DriverManager进行连接
         *    2）生成对象Connection
         * 3:PareparedStatement对象执行sql
         *  //4：结果集处理-- select 处理
         *        返回的是影响行数 -- 添加，删除，修改
         *
         *  //5：提交，--使用自动提交
         *
         *  //6:关闭：从内向外
         * */

        update(301,5000);

    }

    public  static void update(int id,int salary){
        Connection connection=null;
        PreparedStatement pstm=null;
        connection= SqlUtil.getConn();

        String sql="update employees set salary=? where employee_id=?";//占位符：在执行executeUpdate之前进行值得传入
        int i=-1;
        try {
            pstm=connection.prepareStatement(sql);
            /**
             * 第一个参数：占位符的位置，下标1开始
             * 第二个参数：实际值
             */
            pstm.setInt(1,salary);
            pstm.setInt(2,id);
            i=pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            SqlUtil.close(pstm,connection);
        }

        System.out.println("影响的行数为："+i);
    }

}
