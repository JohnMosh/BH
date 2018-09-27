package student;

public class Student {
	private String name;
	private  int course;
	
	public Student(String n, int c){
		this.name = n;
		this.course = c;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCourse() {
		return course;
	}
	
	
//	public static void main(String[] args) {
//		List listStudents = new ArrayList();
//		
//		Student2 s1 = new Student();
//		s1.setName("Vasya");
//		s1.setCourse(1);
//		System.out.println("Student: " + s1.name + ", course " + s1.course);
//		listStudents.add(s1.getName(), s1.getCourse());
//		
//
//		Student s2 = new Student();
//		s2.setName("Petya");
//		s2.setCourse(1);
//		System.out.println("Student: " + s2.name + ", course  " + s2.course);		
//		
//		Student s3 = new Student();
//		s3.setName("Grisha");
//		s3.setCourse(2);
//		System.out.println("Student: " + s3.name + ", course  " + s3.course);
//		
//		Student s4 = new Student();
//		s4.setName("Misha");		
//		s4.setCourse(3);
//		System.out.println("Student: " + s4.name + ", course  " + s4.course);
//		
//		Student s5 = new Student();
//		s5.setName("Vitya");
//		s5.setCourse(4);
//		System.out.println("Student: " + s5.name + ", course  " + s5.course);
//		
//		
//		Student s6 = new Student();
//		s6.setName("Zigmund");
//		s6.setCourse(3);
//		System.out.println("Student: " + s6.name + ", course  " + s6.course);		
//	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}


}
