package com.practice.thouseef;

public class Employee  {

	private int employeeid;
	private String employeeName;
	private double employeeSalary;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeeName="
				+ employeeName + ", employeeSalary=" + employeeSalary + "]";
	}
	public Employee(int employeeid, String employeeName, double employeeSalary) {
		super();
		this.employeeid = employeeid;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public Employee(){
		
	}
	
	
	
	
}
