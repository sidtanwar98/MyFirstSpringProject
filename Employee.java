package com.siddharth;

public class Employee {
	
	int eid;
	String ename, eaddress;
	public void getEid() {
		System.out.println("Employee ID : " + eid);
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void getEname() {
		System.out.println("Employee Name : " + ename);
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void getEaddress() {
		System.out.println("Employee Address : " + eaddress);
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	
}
