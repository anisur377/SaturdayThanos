package com.upskill.java_5;

public class EmployeeBasic {
	
	private String empName;
	private int empAge;
	private int empSsn;
	
	public static void main(String[] args) {
		EmployeeBasic emp = new EmployeeBasic();
		emp.setEmpName("RAFA");
		emp.setEmpAge(25);
		emp.setEmpSsn(23645678);
		
		System.out.println("Employee name is : " + emp.getEmpName());
		System.out.println("Employee age is : " + emp.getEmpAge());
		System.out.println("Employee Ssn is : " + emp.getEmpSsn()); 
	
	}

	
	// getter and setter method
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public int getEmpSsn() {
		return empSsn;
	}

	public void setEmpSsn(int empSsn) {
		this.empSsn = empSsn;
	}

}
