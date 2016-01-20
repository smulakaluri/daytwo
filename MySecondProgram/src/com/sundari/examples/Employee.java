package com.sundari.examples;

public class Employee {

	public static String companyName = "SundariInc";
	
	String name;
	int sal;

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printEmployee(){
		int i;
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Sal: "+sal);
		System.out.println("Company Name: "+companyName);
	}
}