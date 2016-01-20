package com.sundari.examples;

public class Test {

	public static void main(String[] args) {

		Employee empOne;
		Employee empTwo;
		
		empOne = new Employee();
		empTwo = new Employee();
		
		empOne.setName("Sundari");
		empOne.setSal(200000);
		
		empTwo.setName("Mulakaluri");
		empTwo.setSal(250000);
		
		empOne.printEmployee();
		empTwo.printEmployee();
		
		empOne = empTwo;
		
		empOne.printEmployee();
	}

}
