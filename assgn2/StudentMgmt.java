import java.util.Scanner;
import java.util.ArrayList;

public class StudentMgmt {
	static ArrayList<Student> studentList = new ArrayList<Student>();
	static ArrayList<Dept> deptList = new ArrayList<Dept>();

	static void modifyStudent(String name)
	{		
		for(Student student : studentList)
		{
			if(student.getName().equals(name)){
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter new name:");
				name = sc.nextLine();
				System.out.println("Enter new gender:");
				String gender = sc.nextLine();
				System.out.println("Enter new age:");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new address:");
				String addr = sc.nextLine();		

				student.setName(name);
				student.setAge(age);
				student.setGender(gender);
				student.setAddress(addr);
				//sc.close();
				return;
			}
		}
		System.out.println("Student not found!");
	}

	static void addStudent(String name, String gender, int age, String addr)
	{
		Student studentToAdd = new Student(name, gender, addr, age);
		studentList.add(studentToAdd);
		System.out.println("Student added!");
	}

	static void removeStudent(String name) 
	{
		for(Student s : studentList)
		{
			if(s.getName().equalsIgnoreCase(name))
			{
				studentList.remove(s);
				System.out.println("Student removed!");
				return;
			}
		}
		System.out.println("Student not found!");
	}

	static void listStudents()
	{
		for(Student student : studentList)
		{
			System.out.println(student);
		}
	}

	static void addDept(String name, String hod)
	{
		deptList.add(new Dept(name, hod));		
	}

	static void removeDept(String name) 
	{
		for(Dept d : deptList)
		{
			if(d.getName().equalsIgnoreCase(name))
			{
				deptList.remove(d);
				System.out.println("Department removed!");
				return;
			}
		}
		System.out.println("Dept not found!");
	}

	static void modifyDept(String name)
	{
		
		
		for(Dept dept : deptList)
		{
			if(dept.getName().equals(name)){
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter new name:");
				name = sc.nextLine();
				System.out.println("Enter new hod:");
				String hod = sc.nextLine();
				dept.setName(name);
				dept.setHod(hod);				
				//sc.close();
				return;
			}
		}
		System.out.println("Dept not found!");
	}

	static void listDepts()
	{
		for(Dept d : deptList)
		{
			System.out.println(d);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int loopch = 1;
		while(loopch == 1)
		{
			System.out.println("Enter choice:\n1 - add student\n2 - remove student\n3 - modify student\n4 - show students\n5 - add dept\n6 - remove dept\n7 - modify dept\n8 - show depts");
			int ch = sc.nextInt();
			sc.nextLine();
			String name, gender, addr, hod;
			int age;			
		
			switch(ch)
			{
				case 1:
					System.out.println("Enter name:");
					name = sc.nextLine();
					System.out.println("Enter gender:");
					gender = sc.nextLine();
					//sc.nextLine();
					System.out.println("Enter age:");
					age = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter address:");
					addr = sc.nextLine();				
					addStudent(name, gender, age, addr);
					break;
				case 2:
					System.out.println("Enter name of student to remove:");
					name = sc.nextLine();
					removeStudent(name);
					break;
				case 3:
					System.out.println("Enter name of student to modify:");
					name = sc.nextLine();
					modifyStudent(name);
					break;
				case 4:
					listStudents();
					break;
				case 5:
					System.out.println("Enter dept name:");
					name = sc.nextLine();
					System.out.println("Enter hod:");
					hod = sc.nextLine();
					addDept(name, hod);
					break;
				case 6:
					System.out.println("Enter name of dept to remove:");
					name = sc.nextLine();
					removeDept(name);
					break;
				case 7:
					System.out.println("Enter name of dept to modify:");
					name = sc.nextLine();
					modifyDept(name);
					break;
				case 8:
					listDepts();
					break;
				default:
					System.out.println("Invalid option!");
					break;
			}
			System.out.println("Enter choice: 1 - continue, 0 - stop");		
			loopch = sc.nextInt();
		}
		sc.close();

	}
}
