package com.example.demo.model;

public class Employee {

	private Integer empId;
	private String empName;
	private Integer empDeptId;
	private String inTime;
	private String outTime;
	private String faceId;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpDeptId() {
		return empDeptId;
	}
	public void setEmpDeptId(Integer empDeptId) {
		this.empDeptId = empDeptId;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	public String getFaceId() {
		return faceId;
	}
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}
	
	//Constructor with arguments
	public Employee(String empName, Integer empDeptId, String faceId) {
		super();
		this.empName = empName;
		this.empDeptId = empDeptId;
		this.faceId = faceId;
	}
	
	//Constructor without arguments
	public Employee() {
		super();
	}	
	
}
