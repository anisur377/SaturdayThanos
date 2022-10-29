package com.upskill.java_4;

import com.upskill.java_2.MethodType;


	public class PolymorphismOverriding extends MethodType{
		
				
	//Method Overriding -Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override (Modifying)
	
	public static void main(String[] args) {
	MethodType obj = new MethodType();
	obj.annualIncomeVoid();
	//WeeklyIncomeStatic();
		
	}
		
	public static void WeeklyIncomeStatic(){
	int calculateWeeklyIncome = hourlyIncome * 40 + 1000;
	System.out.println("Weekly Income ::: " + calculateWeeklyIncome);
	}
	
	// Void Method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000 + 1000;
		System.out.println("Annual Income ::: " + calculateAnnualIncome);
	}
		
}