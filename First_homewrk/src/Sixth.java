/*Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?
*/
public class Sixth {
	public static void main(String[] args) {
		int a = 0; 
	    int b = 10000; 
	      
	    int n = a + (int) (Math.random() * b); 
	      		
		System.out.println("Созданное число n: " + n);
		int x1 = n / 1000;
		int x2 = n%1000 / 100;
		int x3 = n%100/10;
		int x4 = n%10;
		
		/*System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);	*/
		
		if ((x1 != x2) && (x2 != x3) && (x3 != x4) && (x1 != x3) && (x1 != x4) && (x2 != x4)) {
			System.out.println("Все цифры разные");			
		} else  {
			System.out.println("Есть одинаковые цифры");			
		}
	}

}
