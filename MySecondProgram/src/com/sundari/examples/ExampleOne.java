package com.sundari.examples;

import java.lang.Integer;

public class ExampleOne {

	public static void main(String[] args) {
		int integer = 5;
		char singleCharacter = 'a';
		
		Integer integerClass = new Integer(integer);
		Character characterClass = new Character(singleCharacter);
		
		System.out.println("Before ++ value "+integer);
		integer++;
		System.out.println("Integer value after "+integer);
		integer --;
		System.out.println("Integer value after -- "+integer);
	}
}
