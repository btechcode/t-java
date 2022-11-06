package com.assignment2;
import java.util.Scanner;

public class Restaurant {
	
	public static void menu() {
		System.out.println("\n\tWelcome To Takeo Restaurant: ");
		System.out.println("******************************************");
		System.out.println("\t[1] Biryani Menu ");
		System.out.println("\t[2] Drinks Menu ");
		System.out.println("\t[3] Ice Cream Menu ");
		System.out.println("\t[4] Bill ");
		System.out.println("\t[5] Exit ");
	}
	
	public static void biryani() {
		BiryaniDetails fromBiryaniClass = new BiryaniDetails();
		fromBiryaniClass.task();
	}
	public static void drinks() {
		DrinksDetails fromDrinksClass = new DrinksDetails() ;
		fromDrinksClass.task();
	}
	public static void iceCream() {
		IceCreamDetails fromIceCreamClass = new IceCreamDetails();
		fromIceCreamClass.task();
	}
	public static void bill() {
		//SoftDrinksDetails fromSoftDrinksClass = new SoftDrinksDetails();
		//System.out.println(fromSoftDrinksClass.pepsi_cost(8));
		System.out.println("No Order has been placed!!!!!");
	}
	public static void exit() {
		System.out.println("Thank You For Visiting... ");
		System.out.println("...Customer has been signed out");
		System.exit(0);
	}
	public static void main_task() {
		menu();
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your choice : ");
		int choice = input.nextInt();
		
		switch (choice) {
		case 1:
			biryani();
			break;
		case 2:
			drinks();
			break;
		case 3:
			iceCream();
			break;
		case 4:
			bill();
			break;
		case 5:
			exit();
			break;
		default:
			System.out.println("Please select from the options: ");
		
		
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		main_task();
		
		
	}

}
