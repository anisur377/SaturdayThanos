package com.upskill.assignment_1;

public class Exercise2 {
	
	// Write a java program following below:
	// 1.A method which multiply with two numbers and show in output
	// 2. Another method with holding two variables which will display your first name and last name on the screen.

	
	public static void main(String[] args) {
			int a = 10;
			int b = 5;
			int c = a/b;
			System.out.println(c);
			
	}
	
	public static void myMethod () {			
			myMethod ("Abul");
			myMethod2 ("Hasan");
			

	}
		public static void myMethod(String Name) {
			String FirstName = "Abul";
			System.out.println("First Name : " + FirstName);
}
		public static void myMethod2(String Name) {
			String LastName = "Hasan";
			System.out.println("Last Name : " + LastName);
		}
}
	
	

