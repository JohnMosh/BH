package convert;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Convert {

	public static void main(String[] args) {
		int arr[] = new int [20];
		for (int i = 0; i < arr.length; i++) {
			Random r = new Random();
			arr[i] = r.nextInt(10);
			System.out.print(arr[i] + " ");					
		}				
		convert(arr);
	}
	
	public static void convert(int arr[]){
		
		List <Integer>  list = new  <Integer>  ArrayList();
		System.out.println("\nInitial size of List: "
                + list.size());
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println("Size of List after additions: "
                + list.size());
		System.out.println("Contents of List: " + list);
		
	}

}
