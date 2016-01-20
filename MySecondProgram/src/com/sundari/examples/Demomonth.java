package com.sundari.examples;

public class Demomonth {
	
	public static void main(String[] args) {
		
		String i = args[0];
		String monthString ="";
		
	switch (i)
	{
		case "1":  monthString = "January";
				break;
		case "2":  monthString = "February";
		         break;
		case "3":  monthString = "March";
		         break;
		case "4":  monthString = "April";
		         break;
		case "5":  monthString = "May";
		         break;
		case "6":  monthString = "June";
		         break;
		case "7":  monthString = "July";
		         break;
		case "8":  monthString = "August";
		         break;
		case "9":  monthString = "September";
		         break;
		case "10": monthString = "October";
		         break;
		case "11": monthString = "November";
		         break;
		case "12": monthString = "December";
		         break;
	}
		
		
		// TODO Auto-generated method stub
  
	System.out.println(monthString);

	}
}
