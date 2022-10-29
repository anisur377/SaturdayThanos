		package com.upskill.java_3;

		public class Loops {
	

		public static void main(String[] args) {
		//practiceForLoop();
		//practiceWhileLoop();
		//practiceDoWhileLoop();
		//practicenestedForLoop();
		
		//practiceInfiniteLoop();
		
			
	}
		public static void practiceForLoop() {				// For Loop - Do again and again until upper limit
		int i;												// Initialize the variable
		for (i=1; i<=100; i++) {							// setting lower limit, increment or decrement
		System.out.println("For Loops numbers = " + i);		// Statement 
		}
	}
	
		public static void practiceWhileLoop() {			// While Loop - Do again and again until condition match
		int i = 1;											// Initialize the variable
		while (i <=100){									// setting condition
		System.out.println("While Loops numbers = " + i);	// Statement 
		i++;												// increment or decrement
									
		}
	}
		public static void practiceDoWhileLoop() {			// Do while Loop-Do action then match condition
		int i = 1;											// Initialize the variable
		do {
		System.out.println ("Do while Loops numbers = " +i); // Statement
		i++;												// Increment or decrement
		} while (i <=100);									// checking condition
		
	}
		public static void practiceInfiniteLoop() {				// Infinite Loop - Never ending Loop
		int i;													// Initialize the variable
		for (i=1;  ;i++){										// Setting lower limit, No Upper limit, Increment or decrement
		System.out.println("For Loops numbers = " + i);			// Statement
			
		}
	}
	public static void practicenestedForLoop(){					// Nested Loop = Loop inside another Loop
		int i;													// Initialize variable i
		int j;													// Initialize variable j
		for (i = 1;  i <=10; i++){								// First Loop for i
		for (j = 1;  j<=10; j++){								// Second Loop for j
		int multiplicationTable = i * j;						// Statement for Second Loop 
		System.out.print(multiplicationTable + " ");
		}
		System.out.println(" ");								// Statement for First Loop
		}	
	}

}
