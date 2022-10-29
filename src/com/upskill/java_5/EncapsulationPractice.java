package com.upskill.java_5;

public class EncapsulationPractice{
	
	// Encapsulation used to hide the data using setter and getter method
	
	private String name = "Anis";			// Write & Read
	private int ssn = 45123457;				// Write only
	private String username = "anis123";	// Read only
	
	
	// Setter Method - name 
	public void setName(String value){		// Set the data - write
		name = value;
	}
	// Getter Method - ssn					
	public int getSSN(){					// Get the data - Read
		return ssn;
	}
	
	// Getter Method - name
	public String getName(){				// Get the data - Read
		return name;
	}
	// Setter Method - ssn
	public void setSSN(int value) {			// Set the data - write
		ssn = value;
	}
	// Getter Method - username
	public String getUserName() {			// Get the data - Read
		return username;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Annie");
		System.out.println(obj.getName());
		obj.setSSN(45123457);
		System.out.println(obj.getUserName());
		
	}
	
}	
		
		
