package com.basics1;

public class Employees {
public static void main(String[] args)
{
	Employee e1=new Employee();
	e1.setSalary(100000);
	System.out.println(e1.getSalary());
	Employee e2=new Employee();
	e2.setSalary(200000);
	System.out.println(e2.getSalary());
	double salary=e1.getSalary();
	salary=salary*1.0;
	e1.setSalary(salary);
	System.out.println(e1.getSalary());
	salary=e2.getSalary();
	salary=salary*1.0;
	e2.setSalary(salary);
	System.out.println(e2.getSalary());
	
}
}