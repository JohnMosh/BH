package anyType;

import java.util.ArrayList;
import java.util.List;

public class SaveAnyTypeInArray {
	public static void main(String[] args) {
		
	ArrayList al = new ArrayList();
	al.add("hi");
	al.add(3);
	al.add(32.14);
	System.out.println(al);
	System.out.println(al.get(2));
	}
}



