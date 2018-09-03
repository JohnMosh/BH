/*Имеется целове число (задать с помощью Random rand = new Random(); int x = rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже.
*/

import java.util.Random;

public class Fourth {
	public static void main(String[] args) {
		Random rand = new Random(); 
		String str = null;
		int x = rand.nextInt();
		int y;
		
		if (x%100 > 9 && x%100 < 21) {
            y = 9;
        } else {
            y = x%10;
        }
 
        switch (y) {
            case 1:
                str = " рубль";
                break;
            case 2:
            case 3:
            case 4:
                str = " рубля";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                str = " рублей";
                break;
        }
        System.out.println(x + str);  
}
}
