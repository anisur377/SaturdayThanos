package com.upskill.java_4;

import com.upskill.java_2.MethodType;

public class PolimorphismOverloading extends  MethodType{
	
	// Method Overloading - Compile time Polymorphism/Static binding) Same method name with different signature 
	// to overload (adding)

	public static void main(String[] args) {
	
	house();
	house(2);
	house (2, 4, "White");

	}		
	public static void house(){
	System.out.println("I have a house ! ");
	}
	public static void house(int door){
	System.out.println("I have a house, it has 2 door ");
	
	}
	public static void house(int door, int window){
	System.out.println("I have a house, it has 2 door, " + " it has window " + window);
	}
	
	public static void house(int door, int window, String color){
	System.out.println("I have a house, it has 2 door, " + " It has window " + 4 + " Its color " + color);
	}
}
