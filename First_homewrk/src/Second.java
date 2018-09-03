/*Создайте число. Определите, является ли число трехзначным. Определите, является ли его последняя цифра семеркой. Определите, является ли
 *  число четным.
*/

import java.util.Random;

public class Second {
	public static void main(String[] args) {
		
		Random rand = new Random();	
		
		int number = rand.nextInt(1500);
		System.out.println("Созданное число: " + number);		
		String s1 = Integer.toString(number);
		int length = s1.length();
		
		if (length == 3) {
			System.out.println("Число трёхзначное");
		} else {
			System.out.println("Число не трёхзначное");
		}
		
		if (number%10 == 7) {
			System.out.println("Число оканчивается на 7");
		} else {
			System.out.println("Число не оканчивается на 7");
		}
		
		if (number%2 == 0) {
			System.out.println("Число чётное");
		} else {
			System.out.println("Число нечётное");
		}
	 }
}
