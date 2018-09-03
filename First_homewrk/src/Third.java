/*Имеется прямоугольное отверстие размерами а и b. Определить, можно ли его полностью закрыть круглой картонкой радиусом r.
*/

import java.util.Scanner;

public class Third {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите а: ");
			double a = sc.nextDouble();
			System.out.println("Введите b: ");
			double b = sc.nextDouble();
			System.out.println("Введите r: ");
			double d = (sc.nextDouble())*2;
			sc.close();
			if (Math.sqrt(a*a+b*b)>d) {
					System.out.println("Круг перекроет отверстие");
				} else {
					System.out.println("Круг не перекроет отверстие");
				}
		}
}
