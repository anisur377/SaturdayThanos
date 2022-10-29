 package com.upskill.java_2;

public class IFELseStatement {
	
	public static int age = 16; 

	public static void main(String[] args) {
		if (age<13){
		System.out.println("You are a children");
		}	
		else if(age<13 && age>18){
		System.out.println("You are a Teenager");
		}	
		else if(age>65){
		if(age>100){
		System.out.println("You are Hero");
		}
		else {
		System.out.println("You are Senior");
		}
		}else {
		System.out.println("You are adult");
	
		}				
			
	}
}