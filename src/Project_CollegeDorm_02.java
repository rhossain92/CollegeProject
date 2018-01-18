import java.util.ArrayList;
import java.util.Scanner;

public class Project_CollegeDorm_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<DormRoom> dormroom = new ArrayList<>();
		ArrayList<Student> student = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int choice;
		String building, id, studentName;
		int room;
	
		dormroom.add(new DormRoom("Lincoln", 101));
		dormroom.add(new DormRoom("Lincoln", 102));
		dormroom.add(new DormRoom("Lincoln", 103));

		student.add(new Student("700100", "Bob Smith", dormroom.get(0)));
		student.add(new Student("700101", "Tom Smith", dormroom.get(0)));
		student.add(new Student("700102", "Bob Smith", dormroom.get(2)));
		
		System.out.println("1. Add a new dorm room");
		System.out.println("2. Assign a new student to a dorm room");
		System.out.println("3. List all dorm rooms");
		System.out.println("4. List all students");
		System.out.println("0. Quit");
		System.out.println();
		
		do {
			System.out.print("Please enter your choice: ");
			choice = input.nextInt();
			switch (choice) {
			case 1: 
				System.out.print("Please enter the dorm name: ");
				building = input.next();
				System.out.print("Please enter the room number: ");
				room = input.nextInt();
				boolean isRoomUnique = dormroom.contains(input);
				if (isRoomUnique == false) {
					dormroom.add(new DormRoom(building, room));
				} else {
					System.out.println("Room already exists. ");
				}
				break;
			case 2: 
				System.out.print("Please enter student id: ");
				id = input.next();
				boolean isIdUnique = student.contains(input);
				if (isIdUnique == true) {
					System.out
							.println("Id already exists. ");
				} else {
					System.out.print("Please enter student name: ");
					input.nextLine();
					studentName = input.nextLine();
					for (int i = 0; i < dormroom.size(); i ++){
						System.out.println(i + ": " + dormroom.get(i));
					}
					System.out.print("Please choose a dorm room code: ");
					int chooseRoom = input.nextInt();
					if (chooseRoom >= 0 && chooseRoom < dormroom.size()){
						student.add(new Student(id, studentName, dormroom.get(chooseRoom)));
					} else {
						System.out.println("Code does not exist. ");
					}
				}
				break;
			case 3: 
				for (DormRoom number1 : dormroom)
					System.out.print(number1.building + " " + number1.room + "\n");
				break;
			case 4: 
				for (Student number2 : student)
					System.out.print(number2 + "\n");
				break;
			case 0: 
				System.out.println("You chose to quit. ");
				System.exit(0);
				break;
			default: 
				System.out.println("Invalid input. ");
			}
		} while (choice != 0);
		
		input.close();
	}
}

class DormRoom {
	public String building;
	public int room;

	DormRoom(String arg1, int arg2) {
		building = arg1;
		room = arg2;
	}

	public String toString() {
		return building + " Dorm" + ", Room " + room;
	}
}

class Student {
	public String id;
	public String name;
	public DormRoom dormRoom;

	Student(String arg1, String arg2, DormRoom arg3) {
		id = arg1;
		name = arg2;
		dormRoom = arg3;
	}

	public String toString() {
		return name + ". Your Student ID is " + id
				+ ". You are assigned to the " + dormRoom;
	}
}