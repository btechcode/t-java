package com.assignment2;
import java.util.Scanner;

public class BiryaniDetails {

	static Scanner input = new Scanner(System.in);
	
	
		static double chicken_biryani_price = 10.50;
		static double motton_biryani_price = 15.00;
		static double veg_biryani_price = 5.00;
		
		
		public static double chicken_biryani_cost(int chicken_order) {
			
			return (chicken_order * chicken_biryani_price);
			
		}
		public static double motton_biryani_cost(int motton_order) {
			
			return (motton_order * motton_biryani_price);
			
		}
		public static double veg_biryani_cost(int veg_order) {
			
			return (veg_order * veg_biryani_price);
			
		}
		
	public static void task() {
		System.out.println("\n\tBiryani Menu: ");
		System.out.println("*****************************************");
		System.out.println("\t[1] Chicken Biryani \t\t$" + chicken_biryani_price );
		System.out.println("\t[2] Motton Biryani \t\t$" + motton_biryani_price);
		System.out.println("\t[3] Veg Biryani \t\t$"+ veg_biryani_price);
		System.out.println("\t[4] Return To Main Menu ");
		
		
			System.out.print("Enter your choice : ");
			int choice = input.nextInt();
			if(choice == 4) {
				System.out.println("\nReturning to Main Menu...");
				Restaurant back =  new Restaurant();
				back.main_task();
				}
			System.out.print("How many orders you want: ");
			int order = input.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Total chicken biryani cost $" + chicken_biryani_cost(order));
				break;
			case 2:
				System.out.println("Total chicken biryani cost $" + motton_biryani_cost(order));
				break;
				
			case 3:
				System.out.println("Total veg biryani cost $" + veg_biryani_cost(order));
				break;
			
			
				
			default:
				System.out.println("Select from options: ");
				
				
				
			}
		
	}
	

}
