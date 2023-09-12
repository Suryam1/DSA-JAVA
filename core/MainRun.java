package core;

import java.util.Scanner;

public class MainRun {

	private String choice;
	private static Scanner input = new Scanner(System.in);
	
	public MainRun() {
		// TODO Auto-generated constructor stub
	}
	
	protected void run() {
		System.out.println("Welcome to Hostel");
		System.out.println("Kindly choose your Option :- ");
		System.out.println("1. Register new Student");
		System.out.println("2. Allocate Room");
		System.out.println("3. Allocate Facilities");
		System.out.println("4. Exit App");
		
		choice = input.nextLine().trim();
		
		while(!choice.equalsIgnoreCase("4")) {
			
			Hostel obj = new Hostel();
			
			if(choice.equalsIgnoreCase("1")) {
				
				
				obj.registerNewStudent();
				
			}
			
			else if(choice.equalsIgnoreCase("2")) {
				
				obj.checkRegisteredUser();
				
			}
			
			else if(choice.equalsIgnoreCase("3")) {
				
				obj.showData();
				
			}
			
			System.out.println("Kindly choose your Option :- ");
			System.out.println("1. Register new Student");
			System.out.println("2. Allocate Room");
			System.out.println("3. Allocate Facilities");
			System.out.println("4. Exit App");
			
			choice = input.nextLine().trim();
			
		}
	}

}
