package com.example.demo.repository;

import org.apache.ibatis.annotations.*;
import com.example.demo.model.Employee;
import java.util.List;
import java.util.Optional;

@Mapper
public interface EmployeeRepository {

    @Select("SELECT * FROM employees")
    @Results({
            @Result(property = "empId", column = "emp_id"),
            @Result(property = "empName", column = "emp_name"),
            @Result(property = "empDeptId", column = "emp_dept_id"),
            @Result(property = "inTime", column = "in_time"),
            @Result(property = "outTime", column = "out_time"),
            @Result(property = "faceId", column = "face_id")
    })
    List<Employee> findAll();

    @Select("SELECT * FROM employees WHERE emp_id = #{empId}")
    @Results({
            @Result(property = "empId", column = "emp_id"),
            @Result(property = "empName", column = "emp_name"),
            @Result(property = "empDeptId", column = "emp_dept_id"),
            @Result(property = "inTime", column = "in_time"),
            @Result(property = "outTime", column = "out_time"),
            @Result(property = "faceId", column = "face_id")
    })
    Optional<Employee> findById(Integer empId);

    @Delete("DELETE FROM employees WHERE emp_id = #{empId}")
    int deleteById(Integer empId);

    @Insert("INSERT INTO employees(emp_name, emp_dept_id, in_time, out_time, face_id) " +
            "VALUES (#{empName}, #{empDeptId}, #{inTime}, #{outTime}, #{faceId})")
    int insert(Employee employee);

    @Update("UPDATE employees SET emp_name=#{empName}, emp_dept_id=#{empDeptId}, " +
            "in_time=#{inTime}, out_time=#{outTime}, face_id=#{faceId} WHERE emp_id=#{empId}")
    int update(Employee employee);
}
