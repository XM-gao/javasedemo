package com.neuedu.dataconnection;

import com.neuedu.util.SqlUtil;

import java.sql.*;

public class MysqlConn01 {
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


//  2:进行连接数据库

        Connection connection=null;
        PreparedStatement pstm=null;
        ResultSet rs=null;
        /*
        * 1:url: jdbc:mysql://ip:3306/databasename
        *       jdbc:使用jdbc连接数据库
        *       mysql：连接的mysql的数据库，使用mysql的驱动
        *       IP：数据库所在的服务器地址：如果是本地：127.0.0.1|localhost，如果不是本地IP
        *       3306：端口号，默认
        *       databasename：数据库名
        *  2:username:数据库用户名
        *  3：password：用户名对应的密码
        * */
        String url="jdbc:mysql://127.0.0.1:3306/hr";
        String username="root";
        String password="123456";
        try {
            connection= SqlUtil.getConn();
           // 3:PreparedStatement对象执行sql
            String sql="select * from employees";
            pstm=connection.prepareStatement(sql);//预编译SQL语句
            //4：结果集处理
          rs = pstm.executeQuery();
         while(rs.next()){
             System.out.println(rs.getObject(1)+"   "+rs.getObject("salary"));
         }
         //5：自动提交
            /* System.out.println(connection);*/
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //6:关闭
           SqlUtil.close(rs,pstm,connection);

        }

    }
}
