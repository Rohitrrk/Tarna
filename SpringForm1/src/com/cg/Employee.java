package com.cg;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {

	@Size(min=1,max=3,message="enter less than 3, more than 1")
	private String name;
	@NotNull(message="enter name ")
	private String dept;
	private String city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
