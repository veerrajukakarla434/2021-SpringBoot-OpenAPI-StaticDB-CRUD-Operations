package com.springboot.openapi.model;

public class Employee {
	
	private String emmId;
	private String name;
	private String address;
	private String phone;
	
	
	public String getEmmId() {
		return emmId;
	}
	public void setEmmId(String emmId) {
		this.emmId = emmId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Employee [emmId=" + emmId + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	

}
