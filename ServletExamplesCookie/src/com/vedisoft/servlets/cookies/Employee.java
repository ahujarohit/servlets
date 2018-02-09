package com.vedisoft.servlets.cookies;

public class Employee {

    protected int code;
    protected String name;
    protected String department;
    protected String designation;
    protected float basic;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getBasic() {
		return basic;
	}
	public void setBasic(float basic) {
		this.basic = basic;
	}
	public Employee(int code, String name, String department, String designation, float basic) {
		super();
		this.code = code;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.basic = basic;
	}
	public Employee(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
    
    
}
