package com.upskill.assignment_1;

public class Problem3 {
	
	/* A function which returns the multiply value of a and b where a=9 and b=11
	   Write a program which will display addition of a+b+function returns value */

	public static void main(String[] args) {
		
			
		int a = 9;
		int b = 11;
		int c = multiplyvalue();
		System.out.println("The result is " + (a+b+c));
		
	}
		public static int multiplyvalue(){
			int a = 9;
			int b = 11;
			int c = a*b;
			return c;
		
	}

}
