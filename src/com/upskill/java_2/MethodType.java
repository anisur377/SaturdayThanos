package com.upskill.java_2;

public class MethodType {X
	
	/* 	Types of Methods
	 
		1.Void Method - No Return data. Must Create an Object
		2.Return Type Method - Must have some Return data
		3.Static Void Method  - Static is the main key to identify Static Method */
			
	public static int hourlyIncome = 75;

	public static void main(String[] args) {
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		obj.monthlyIncomeReturn();
		WeeklyIncomeVoid(); 

	}
	
	//Void Method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome *2000;
		System.out.println("Annual Income ::: " + calculateAnnualIncome);
	}
	
	//Return Type Method 
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		System.out.println("Monthly Income ::: " + calculateMonthlyIncome);
		return calculateMonthlyIncome;
	}
	
	//Static Void Method
	public static void WeeklyIncomeVoid(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("Weekly Income ::: " + calculateWeeklyIncome);
	}
}
