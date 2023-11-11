package hostel;
import java.util.*;
public class Hostel {
	static final int ROOM=10;
	static final int bed=4;
	private int beds;
	private int students;
	private int roomNo;
	//private int bedAllocated;
	
	Map<Integer,ArrayList<Integer>> mp=new HashMap<>();
	

	public Hostel() {
		beds=ROOM*bed;
		students=0;
	}
	public boolean addStudent(){
		if(students>beds){
			System.out.println("Cannot be added");
			return false;
		}
		System.out.println("Student added");
		students++;
		return true;
	}
	public void roomAndBedAllocated(){
		roomNo=students%bed==0?students/bed:students/bed+1;
		//bedAllocated=students%beds;
	}
	public void allocateRoom(){
		ArrayList<Integer> list;
		if(mp.get(roomNo)!=null)
		list=mp.get(roomNo);
		else
			list=new ArrayList<>();
		list.add(students);
		mp.put(roomNo,list );
	}
	public void showData(){
		for(Map.Entry<Integer, ArrayList<Integer>> entry:mp.entrySet()){
			System.out.println((entry.getKey()+100)+" 	"+entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Hostel obj=new Hostel();
		int termination=0;
		while(termination==0&&obj.addStudent()==true){
			obj.roomAndBedAllocated();
			obj.allocateRoom();
			System.out.print("If you want to terminate the program type 1 else 0: ");
			termination=sc.nextInt();
		}
		System.out.println("Details of students are");
		obj.showData();
		
		sc.close();
	}

}
