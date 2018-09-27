package Collect;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;



public class collect {
	public static void main(String[] args) {
		Set <Integer> set1 = new LinkedHashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(5);
		set1.add(7);
		set1.add(8);
		System.out.println("Collection 1: " + set1);
		
		Set <Integer> set2 = new LinkedHashSet<>();
		set2.add(1);
		set2.add(6);
		set2.add(9);
		set2.add(14);
		set2.add(3);
		set2.add(7);
		System.out.println("Collection 2: " + set2);	
		
		System.out.println("Union result: " + union(set1, set2));
		System.out.println("Intersection result: " + intersect(set1, set2));
		
	}
	
	private static List union(Set set1, Set set2){
		 List <Object> result = new ArrayList<Object>();
		 result.addAll(set1);
		 result.addAll(set2);
		 return result;		
		}		
	
	public static Set intersect(Set set1, Set set2){
		  set1.retainAll(set2);
		  return set1;
		}		
	
	}

	