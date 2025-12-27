package com.project1.Dto;

public class studentDto {

	String name;
	int roleN0;
	String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoleN0() {
		return roleN0;
	}
	public void setRoleN0(int roleN0) {
		this.roleN0 = roleN0;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "studentDto [name=" + name + ", roleN0=" + roleN0 + ", address=" + address + "]";
	}
	
	
}
