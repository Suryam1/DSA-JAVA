package core;

import java.util.Scanner;

public class StudentsData {

	private static Scanner input;
	
	private String universityId;
	private String name;
	private String perference;
	private int roomNumber;
	

	static {
		input = new Scanner(System.in);
	}
	
	protected int getRoomNumber() {
		return roomNumber;
	}
	protected void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	protected String getUniversityId() {
		return universityId;
	}
	private void setUniversityId(String universityId) {
		this.universityId = universityId;
	}

	protected String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	
	protected String getPerference() {
		return perference;
	}
	protected void setPerference(String perference) {
		this.perference = perference;
	}
	
	public StudentsData() {
		// TODO Auto-generated constructor stub
	}
	
	protected void takeData() {
		
		System.out.print("Enter your University Id : ");
		setUniversityId(input.nextLine().trim());
		
		System.out.print("Enter your Name : ");
		setName(input.nextLine().trim());
		
	}

}
