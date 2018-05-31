package com.basics1;

public class Employee {
	private String name;
	private String lastname;
	double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void incrementsalary(int percent)
	{
		double newsalary=salary+percent*salary;
		this.salary=newsalary;
	}

}
