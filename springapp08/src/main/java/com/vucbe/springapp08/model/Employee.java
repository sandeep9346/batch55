package com.vucbe.springapp08.model;

public class Employee {
	int empid;
	String empname;
	double empsal;
	int empage;
	String empaddress;
	
	public Employee(int empid, String empname, double empsal, int empage, String empaddress) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empage = empage;
		this.empaddress = empaddress;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	

}
