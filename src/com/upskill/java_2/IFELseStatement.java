 package com.upskill.java_2;

public class IFELseStatement {
	
	public static int age = 102;

	public static void main(String[] args) {
		age();
	}
		
		
		public static void age (){
		if (age<13){
			System.out.println("You are a children");
		
		} else if (age > 13 && age < 18) {
			System.out.println("You are Teenager");
		
		} else if (age >= 60) {
			System.out.println("You are Senior");
			
			// Nested If Else Statement
		if (age > 100) {
			System.out.println("You are Hero");
		}
	
		
		}
		
		
		}
}