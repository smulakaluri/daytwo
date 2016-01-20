package com.sundari.examples;

public class ExampleTwo {

	public static void main(String[] args) {
		
		Integer a = new Integer(args[0]);
		Integer b = new Integer(args[1]);
		Integer c = new Integer(args[2]);
		
		System.out.println("Is a greater than c? "+(a.intValue()>=c.intValue()));
		System.out.println("Is a less than equals c? "+(a.intValue()<=c.intValue()));
		System.out.println("Is a equals b? "+(a.intValue()==b.intValue()));
		
		if(a.intValue()>b.intValue()){
			System.out.println(a);
		}else if(b.intValue()>c.intValue()){
			System.out.println(b);
			
		}else {
			System.out.println(c);
		}
		
	}
}
