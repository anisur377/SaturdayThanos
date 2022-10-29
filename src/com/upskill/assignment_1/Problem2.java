package com.upskill.assignment_1;

public class Problem2 {
	
	//A rectangle width and length are: 9 and 13 inches. Write a method to display the parameter of rectangle in console output.

	public static void main(String[] args) {
		Problem2 myobject = new Problem2 ();
		myobject.myMethod();
		

	}
	public void myMethod(){
		int a = 9;
		int b = 13;
		int c = a+b;
		System.out.println("The Parameter of Rectangle is " + c);
	}

}
