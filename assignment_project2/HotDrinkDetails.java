package com.assignment2;

import java.util.Scanner;

public class HotDrinkDetails {
	static Scanner input = new Scanner(System.in);
	static double tea_price = 5;
	static double coffee_price = 5;
	
	
	public static double tea_cost(int tea_order) {
		
		return (tea_order * tea_price);
		
	}
	public static double coffee_cost(int coffee_order) {
		
		return (coffee_order * coffee_price);
		
	}

	
	public static void task() {
		System.out.println("\tSoft-Drink Menu: ");
		System.out.println("***************************");
		System.out.println("\t[1] Tea  \t\t$" + tea_price );
		System.out.println("\t[2] Coffee \t\t$" + coffee_price);
		System.out.println("\t[3] Return to Main Menu");
		
		
		
			System.out.print("Enter your choice : ");
			int choice = input.nextInt();
			if(choice == 3) {
				System.out.println("\nReturning to Main Menu...");
				Restaurant back =  new Restaurant();
				back.main_task();
				}
			System.out.print("How many orders you want: ");
			int order = input.nextInt();
			if(choice == 3) {
				System.out.println("\nReturning to Main Menu...");
				Restaurant back =  new Restaurant();
				back.main_task();
				}
		
			
			switch (choice) {
			case 1:
				System.out.println("Total Tea cost $" + tea_cost(order));
				break;
			case 2:
				
				System.out.println("Total Coffee cost $" + coffee_cost(order));
				break;
				
			default:
				System.out.println("Select from options: ");
				
				
				
			}
			
			
	}
	
	

}
