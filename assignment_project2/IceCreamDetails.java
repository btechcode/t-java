package com.assignment2;

import java.util.Scanner;

public class IceCreamDetails {
	static Scanner input = new Scanner(System.in);
	static double vanilla_price = 5.75;
	static double choco_price = 5.50;
	
	
	public static double vanilla_cost(int vanilla_order) {
		
		return (vanilla_order * vanilla_price);
		
	}
	public static double choco_cost(int choco_order) {
		
		return (choco_order * choco_price);
		
	}

	
	public static void task() {
		System.out.println("\tIce-Cream Menu: ");
		System.out.println("***************************");
		System.out.println("\t[1] Vanilla Ice-Cream  \t\t$" + vanilla_price );
		System.out.println("\t[2] Choco Ice-Cream \t\t$" + choco_price);
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
		
			
			switch (choice) {
			case 1:
				System.out.println("Total Vanilla Ice Cream cost $" + vanilla_cost(order));
				break;
			case 2:
				
				System.out.println("Total Choco Ice Cream cost $" + choco_cost(order));
				break;
				
			
			default:
				System.out.println("Select from options: ");
				
				
				
			}
			
			
	}
	

}
