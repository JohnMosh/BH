/*Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд: 
А) минут + секунд, 
В) часов + минут + секунд, 
С) дней + часов + минут + секунд, 
D) недель + дней + часов + минут + секунд. 
по аналогии с имеющимся кодом:
public class TaskOne {
public static void main(String[] args) {
		int sec = 4_521_424;
		int min = sec/60;
		int secRest = sec%60;
	
System.out.println(sec + " seconds is: " + min +" full minutes and " + secRest + " seconds.");
System.out.println("OR");
	}
}*/

public class First {
	public static void main(String[] args) {
		int sec = 4500;
		int min = sec/60;
		int secRest = sec%60;
		int hour = min/60;
		int minRest = min%60;
		int day = hour/24;
		int hourRest = hour%24;
		int week = day/7;
		int dayRest = day%7;
		

	
System.out.println("A) " + sec + " seconds is: " + min +" full minutes and " + secRest + " seconds.");
System.out.println("\n OR \n");
System.out.println("B) " + sec + " seconds is: " + hour +" full hours,  " + minRest +"  minutes and " + secRest + " seconds.");
System.out.println("\n OR \n");
System.out.println("C) " + sec + " seconds is: " + day +" full days,  " + hourRest + " hours,  " + minRest +"  minutes and " + secRest + " seconds.");
System.out.println("\n OR \n");
System.out.println("D) " + sec + " seconds is: " + week +" full weeks,  " + dayRest +" days,  " + hourRest + " hours,  " + minRest +"  minutes and " + secRest + " seconds.");
	}


} 