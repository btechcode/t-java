package com.assignment2;

import java.util.Scanner;

public class DrinksDetails {
	public static void menu() {
		System.out.println("\tDrinks Details: ");
		System.out.println("***************************");
		System.out.println("\t[1] Soft-Drinks Menu ");
		System.out.println("\t[2] Hard-Drinks Menu ");
		System.out.println("\t[3] Return To Main Menu ");
	
	}
	
	public static void soft_drinks() {
		SoftDrinksDetails fromSoftDrinksClass = new SoftDrinksDetails();
		fromSoftDrinksClass.task();
	}
	public static void hard_drinks() {
		HotDrinkDetails fromHotDrinkClass = new HotDrinkDetails();
		fromHotDrinkClass.task();
	}

	
	public static void task() {
		menu();
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your choice : ");
		int choice = input.nextInt();
		
		switch (choice) {
		case 1:
			soft_drinks();
			break;
		case 2:
			hard_drinks();
			break;
		case 3:
			System.out.println("Returning to Main Menu");
			Restaurant back =  new Restaurant();
			back.main_task();
			break;
		
		default:
			System.out.println("Please select from the options: ");
		
		
		}
		
	}
}
