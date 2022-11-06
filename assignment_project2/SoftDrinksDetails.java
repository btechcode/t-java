package com.assignment2;

import java.util.Scanner;

public class SoftDrinksDetails {
	
	static Scanner input = new Scanner(System.in);
	static double pepsi_price = 5;
	static double cocacola_price = 5;
	static double seven_up_price = 5;
	static double mango_lassi_price = 2.5;
	
	public static double pepsi_cost(int pepsi_order) {
		
		return (pepsi_order * pepsi_price);
		
	}
	public static double cocacola_cost(int cocacola_order) {
		
		return (cocacola_order * cocacola_price);
		
	}
	public static double seven_up_cost(int seven_up_order) {
		
		return (seven_up_order * seven_up_price);
		
	}
	public static double mango_lassi_cost(int mango_lassi_order) {
		
		return (mango_lassi_order * mango_lassi_price);
		
	}
	
	public static void task() {
		System.out.println("\tSoft-Drink Menu: ");
		System.out.println("***************************");
		System.out.println("\t[1] Pepsi  \t\t$" + pepsi_price );
		System.out.println("\t[2] Cocacola \t\t$" + cocacola_price);
		System.out.println("\t[3] 7-Up \t\t$"+ seven_up_price);
		System.out.println("\t[4] Mango Lassi \t$" + mango_lassi_price);
		System.out.println("\t[5]Return to Main Menu");
		
		
			System.out.print("Enter your choice : ");
			int choice = input.nextInt();
			if(choice == 5) {
				System.out.println("\nReturning to Main Menu...");
				Restaurant back =  new Restaurant();
				back.main_task();
				}
			System.out.print("How many orders you want: ");
			int order = input.nextInt();
		
			
			switch (choice) {
			case 1:
				System.out.println("Total Pepsi cost $" + pepsi_cost(order));
				break;
			case 2:
				
				System.out.println("Total Cocacola cost $" + cocacola_cost(order));
				break;
				
			case 3:
				System.out.println("Total 7-Up cost $" + seven_up_cost(order));
				break;
			case 4:
				System.out.println("Total Mango Lassi cost $" + mango_lassi_cost(order));
				break;
			
			default:
				System.out.println("Select from options: ");
				
				
				
			}
			
			
	}
	

}
