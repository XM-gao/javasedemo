package com.neuedu.util;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 对ResultSet中对象的处理
 *  Employees e=new Employees();
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

   ResultSet中的一条记录转换为对象T
 * @param <T>
 */
public interface ResultSetObject<T> {

    T getResultSetOne(ResultSet resultSet) throws SQLException;
}
