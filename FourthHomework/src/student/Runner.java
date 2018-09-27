package student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		ArrayList <Student> studentsList = new ArrayList<Student>(){
			{
			add(new Student("Vasya", 1));
			add(new Student("Petya", 1));
			add(new Student("Zigmund", 2));
			add(new Student("Iosif", 3));
			add(new Student("Viktor", 3));
			add(new Student("Sanya", 4));
			}
		};
		System.out.println(studentsList);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter course: ");
		int inp = sc.nextInt();
		
		printStudents(studentsList, inp);		
	}
	
	
	private static void printStudents(ArrayList s, int c){
		Iterator<Student> it = s.iterator();
		
		while (it.hasNext()) {
			Student st = it.next();
			if (st.getCourse() == c) {
				System.out.println("Student: " + st);
			}			
		}		
	}
}
