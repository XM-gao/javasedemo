package com.neuedu.util;

import java.sql.*;

public class SqlUtil {

    static {//静态代码块
        //1：加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //2:连接数据库，生成Connection对象
    public static Connection getConn(){
        Connection connection=null;
        String url="jdbc:mysql://127.0.0.1:3306/hr";
        String username="root";
        String password="123456";
        try {
            connection= DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    //6:关闭

    /**
     *
     * @param objects：可变数组
     */
    public static void close(Object ...objects){
        if(objects!=null && objects.length>0){
            try{
                for(Object obj:objects){
                    if(obj!=null){
                        if(obj instanceof Connection){
                            ((Connection)obj).close();
                        }
                        if(obj instanceof Statement){
                            ((Statement)obj).close();
                        }
                        if(obj instanceof ResultSet){
                            ((ResultSet)obj).close();
                        }

                    }

                }


            }catch (SQLException e){
                e.printStackTrace();
            }

        }
    }





}
