/*������� ������ ����� (������ � ������� Random rand = new Random(); int x = rand.nextInt() ). ��� ����� � ��������� ����� � ������. ������� ��� �����, ������� � ���� ����� ������� � ���������� ������.
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
                str = " �����";
                break;
            case 2:
            case 3:
            case 4:
                str = " �����";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                str = " ������";
                break;
        }
        System.out.println(x + str);  
}
}
