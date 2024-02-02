//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package com.PromineoTech;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int availiblePlaneSeats = 5;
		System.out.println(availiblePlaneSeats);
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 58.50; 
		System.out.println("Amount Due: $" + costOfGroceries);
		
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'X'; 

	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHotOutside = false; 

		
		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Roman"; 

		
		// 6. Create a variable to hold a street address
		String streetAddress = "1220 N. 8th St."; 
		

		// 7. Print all variables to the console
		System.out.println(availiblePlaneSeats);
		System.out.println(costOfGroceries);
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(customerFirstName);
		System.out.println(streetAddress);
		
		
	

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		availiblePlaneSeats = availiblePlaneSeats - 2;
			
	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries = costOfGroceries + 2.15;
		System.out.println(costOfGroceries);

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'R';
		System.out.println(middleInitial);

		
		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isHotOutside = true; 
		


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = customerFirstName + " " + middleInitial + " Bobko";
				System.out.println(fullName);
	

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
				System.out.println("This is " + fullName + " they live at " + streetAddress);
				
				   int x = 10;
				      int y = 25;
				      int z = y - x;
				      System.out.println(z);
				

		
		
	}
}