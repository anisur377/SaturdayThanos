package com.upskill.java_2;

public class IfElseConcept {

	public static void main(String[] args) {
	int a = 30;
	int b = 20;
	
	if(b>a){
		System.out.println("b is greater then a");
	}
	else{
		System.out.println("a is greater then b");
	}
	// Comparison operators :
	// < > <=  >= == !=
		
		int c = 40;
		int d = 50;
		if (c == d){
			System.out.println("c and d are equal");
		}else {
			System.out.println("c and d are not equal");
		}
		// write a logic to find out the highest number
		int a1 = 400;
		int b1 = 500;
		int c1 = 300;
		
		// Nested if-elase
		
		if (a1>b1 & a1>c1){ 
			System.out.println("a1 is the greatest");
		}else if(b1>c1) { 
			System.out.println("b1 is the greatest");
		}else{
			System.out.println("c1 is the greatest");
		}
	}

}
