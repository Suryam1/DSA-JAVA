package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Hostel {

	private static Scanner input = new Scanner(System.in);
	
	private String tempId;
	private boolean flag=false;
	private int singleRoomsAvailableCount=0;
	private int doubleRoomsAvailableCount=0;
	private int fourRoomsAvailableCount=0;
	private String choice; 
	private boolean flag2;
	
	private static ArrayList<StudentsData> registeredStudents = new ArrayList<StudentsData>();
	private static HashMap<Integer, List<StudentsData>> allocatedRoom= new HashMap<>();
	
	private static int[] singleBedRooms = {1,1,1,1};
	private static boolean[] singleRoomsAvailability = {true,true,true,true};
	
	private static int[] doubleBedRooms = {2,2,2,2};
	private static boolean[] doubleRoomsAvailability = {true,true,true,true};
	
	private static int[] fourBedRooms = {4,4,4,4};
	private static boolean[] fourRoomsAvailability = {true,true,true,true};
	
	public Hostel() {
		// TODO Auto-generated constructor stub
	}
	
	protected void registerNewStudent() {
		
		StudentsData student = new StudentsData();
		
		student.takeData();
		
		registeredStudents.add(student);
		
	}
	
	
	protected void checkRegisteredUser() {
		
		System.out.print("Kindly Enter your University Id : ");
		tempId = input.nextLine();
		
		for(StudentsData student : registeredStudents) {
			if(student.getUniversityId().equalsIgnoreCase(tempId)) {
				System.out.println("User is Registered");
				flag=true;
				
				countAvailableSingleRooms();
				countAvailableDoubleRooms();
				countAvailableFourRooms();
				System.out.println("Available Rooms are :-");
				System.out.println("Single Share Rooms :- "+singleRoomsAvailableCount);
				System.out.println("Double Share Rooms :- "+doubleRoomsAvailableCount);
				System.out.println("Four Share Rooms :- "+fourRoomsAvailableCount);
				System.out.print("Kindly Enter your Perference");
				choice=input.nextLine().trim();
				
				if(choice.equalsIgnoreCase("Single Share")) {
					flag2=false;
					student.setPerference(choice);
					List<StudentsData> temp = new ArrayList<StudentsData>();
					for(int i=0;i<singleBedRooms.length;i++) {
						if(singleBedRooms[i]>0 && flag2==false) {
							student.setRoomNumber(i+1);
							singleBedRooms[i]--;
							flag2=true;
							temp.add(student);
							allocatedRoom.put((i+1), temp);
							System.out.println("Room Allocated!!!");
						}
						if(singleBedRooms[i]==0) {
							singleRoomsAvailability[i]=false;
							allocatedRoom.put((i+1), temp);
						}
					}
				}
				
				else if(choice.equalsIgnoreCase("Double Share")) {
					flag2=false;
					student.setPerference(choice);
					List<StudentsData> temp = new ArrayList<StudentsData>();
					for(int i=0;i<doubleBedRooms.length;i++) {
						if(doubleBedRooms[i]>0 && flag2==false) {
							student.setRoomNumber(i+10);
							doubleBedRooms[i]--;
							flag2=true;
							temp.add(student);
							allocatedRoom.put((i+10), temp);
							System.out.println("Room Allocated!!!");
						}
						if(doubleBedRooms[i]==0) {
							doubleRoomsAvailability[i]=false;
							allocatedRoom.put((i+10), temp);
						}
					}
				}
				
				else if(choice.equalsIgnoreCase("Four Share")) {
					flag2=false;
					student.setPerference(choice);
					List<StudentsData> temp = new ArrayList<StudentsData>();
					for(int i=0;i<fourBedRooms.length;i++) {
						if(fourBedRooms[i]>0 && flag2==false) {
							student.setRoomNumber(i+20);
							fourBedRooms[i]--;
							flag2=true;
							temp.add(student);
							allocatedRoom.put((i+20), temp);
							System.out.println("Room Allocated!!!");
						}
						if(fourBedRooms[i]==0) {
							fourRoomsAvailability[i]=false;
							allocatedRoom.put((i+20), temp);
						}
					}
				}
				
			}
		}
		
		if(flag==false) {
			System.out.println("Student is either not registerd or entered wrong university Id.");
		}
		
	}
	
	protected void showData() {
		
		for(Entry<Integer, List<StudentsData>> entry : allocatedRoom.entrySet()) {
			System.out.println("Room Number : "+entry.getKey());
			List<StudentsData> temp = new ArrayList<StudentsData>();
			temp=entry.getValue();
			for(StudentsData student : temp) {
				System.out.println("Name : "+student.getName());
				System.out.println("University Id : "+student.getUniversityId());
			}
		}
		
	}

	private void countAvailableFourRooms() {
		// TODO Auto-generated method stub
		for(boolean flag : fourRoomsAvailability) {
			if(flag==true) {
				fourRoomsAvailableCount++;
			}
		}
	}

	private void countAvailableDoubleRooms() {
		// TODO Auto-generated method stub
		for(boolean flag : doubleRoomsAvailability) {
			if(flag==true) {
				doubleRoomsAvailableCount++;
			}
		}
	}

	private void countAvailableSingleRooms() {
		// TODO Auto-generated method stub
		for(boolean flag : singleRoomsAvailability) {
			if(flag==true) {
				singleRoomsAvailableCount++;
			}
		}
	}

}
