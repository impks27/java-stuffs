package com.demo.ws;

public class Emp {
	private int empId;
	private String name;
	private String location;
	private double salary;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Emp(int empId, String name, String location, double salary) {
		this.empId = empId;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
