package com.upskill.java_6;

public class ExceptionPractice {

	public static void main(String[] args) {
		
		try{
		int[] ageGroup = new int[]{23, 25, 35, 30, 22};
		System.out.println("Employee Age = " +ageGroup[2]);
		} catch (Exception e) {
			System.out.println("Array Index not available !");
			e.printStackTrace();
		
		}



