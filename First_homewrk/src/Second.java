/*�������� �����. ����������, �������� �� ����� �����������. ����������, �������� �� ��� ��������� ����� ��������. ����������, �������� ��
 *  ����� ������.
*/

import java.util.Random;

public class Second {
	public static void main(String[] args) {
		
		Random rand = new Random();	
		
		int number = rand.nextInt(1500);
		System.out.println("��������� �����: " + number);		
		String s1 = Integer.toString(number);
		int length = s1.length();
		
		if (length == 3) {
			System.out.println("����� ����������");
		} else {
			System.out.println("����� �� ����������");
		}
		
		if (number%10 == 7) {
			System.out.println("����� ������������ �� 7");
		} else {
			System.out.println("����� �� ������������ �� 7");
		}
		
		if (number%2 == 0) {
			System.out.println("����� ������");
		} else {
			System.out.println("����� ��������");
		}
	 }
}
