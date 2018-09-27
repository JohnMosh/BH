package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_v2 {
	String name;
	int course;
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public int getCourse() {
		return course;
	}
	
	public void setCourse(int c) {
		this.course = c;
	}
	
//	public static void main(String[] args) {
//		List listStudents = new ArrayList();
//		
//		Student_v2 s1 = new Student_v2();
//		s1.setName("Vasya");
//		s1.setCourse(1);
//		System.out.println("Student: " + s1.name + ", course " + s1.course);
//		listStudents.add(s1.getName(), s1.getCourse());
//		
//
//		Student_v2 s2 = new Student_v2();
//		s2.setName("Petya");
//		s2.setCourse(1);
//		System.out.println("Student: " + s2.name + ", course  " + s2.course);		
//		
//		Student_v2 s3 = new Student_v2();
//		s3.setName("Grisha");
//		s3.setCourse(2);
//		System.out.println("Student: " + s3.name + ", course  " + s3.course);
//		
//		Student_v2 s4 = new Student_v2();
//		s4.setName("Misha");		
//		s4.setCourse(3);
//		System.out.println("Student: " + s4.name + ", course  " + s4.course);
//		
//		Student_v2 s5 = new Student_v2();
//		s5.setName("Vitya");
//		s5.setCourse(4);
//		System.out.println("Student: " + s5.name + ", course  " + s5.course);
//		
//		
//		Student_v2 s6 = new Student_v2();
//		s6.setName("Zigmund");
//		s6.setCourse(3);
//		System.out.println("Student: " + s6.name + ", course  " + s6.course);		
//	}

	@Override
	public String toString() {
		return "Student_v2 [name=" + name + ", course=" + course + "]";
	}


}
