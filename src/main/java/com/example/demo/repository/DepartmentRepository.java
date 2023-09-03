package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Department;

@Mapper
public interface DepartmentRepository {
	
	@Select("SELECT * FROM departments")
    @Results({
            @Result(property = "deptId", column = "dept_id"),
            @Result(property = "deptName", column = "dept_name")
    })
    List<Department> findAll();
}
