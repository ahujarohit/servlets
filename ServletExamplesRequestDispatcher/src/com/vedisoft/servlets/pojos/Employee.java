package com.vedisoft.servlets.pojos;

import java.util.Date;

public class Employee {

	protected int code;
	protected String name;
	protected String dept;
	protected String desig;
	protected float basic;
	protected Date doj;

	public Employee() {
		name = new String();
		dept = new String();
		desig = new String();
		doj = new Date();
	}

	public Employee(int code, String name, String dept, String desig, float basic, Date doj) {
		super();
		this.code = code;
		this.name = name;
		this.dept = dept;
		this.desig = desig;
		this.basic = basic;
		this.doj = doj;
	}

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public float getBasic() {
		return basic;
	}

	public void setBasic(float basic) {
		this.basic = basic;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [code=" + code + ", name=" + name + ", dept=" + dept + ", desig=" + desig + ", basic=" + basic
				+ ", doj=" + doj + "]";
	}

}
