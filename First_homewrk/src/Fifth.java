/*Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n. 
*/
public class Fifth {
	public static void main(String[] args) {
						
		int a = 0; 
	    int b = 10000; 
	      
	    int n = a + (int) (Math.random() * b); 
	      		
		System.out.println("Созданное число n: " + n);
		
		String s1 = Integer.toString(n);
		StringBuffer buffer = new StringBuffer(s1);		
	    buffer.reverse();	       
	       System.out.println("Число в обратном порядке: " + buffer);
	}

}
