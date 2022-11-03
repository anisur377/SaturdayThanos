package com.upskill.assignment_1;

public class Problem4 {

	// A function returns 30, another function return 50, Write a java program which will 
	// display subtraction value from bigger number to smaller //
	
	public static int functionReturns30() {
	return 30;
	}
	public static int functionReturnd50() {
	return 50;
	}
	public static void main(String[] args) {
		
		int subtractionValue = functionReturnd50() - functionReturns30(); 
		
		System.out.println("Subtraction value from bigger to smaller " + subtractionValue);
		
	}
}
