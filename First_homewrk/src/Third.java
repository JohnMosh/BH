/*������� ������������� ��������� ��������� � � b. ����������, ����� �� ��� ��������� ������� ������� ��������� �������� r.
*/

import java.util.Scanner;

public class Third {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������� �: ");
			double a = sc.nextDouble();
			System.out.println("������� b: ");
			double b = sc.nextDouble();
			System.out.println("������� r: ");
			double d = (sc.nextDouble())*2;
			sc.close();
			if (Math.sqrt(a*a+b*b)>d) {
					System.out.println("���� ��������� ���������");
				} else {
					System.out.println("���� �� ��������� ���������");
				}
		}
}
