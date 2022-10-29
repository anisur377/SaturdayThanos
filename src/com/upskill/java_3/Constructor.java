package com.upskill.java_3;

public class Constructor {
	
	
	String studentName;
	int studentAge;
	String studentCity;
	
	public Constructor(String name, int age, String city){
		studentName = name;
		studentAge = age;
		studentCity = city;
	
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor ("Anis", 40, "NYC");
		System.out.println(obj.studentName);
		System.out.println(obj.studentAge);
		System.out.println(obj.studentCity);
		
	}
}


	