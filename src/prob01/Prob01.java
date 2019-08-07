package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		
		System.out.print( "금액: " );
		int money = scanner.nextInt();
		
		int n50000 = money / 50000;
		money %= 50000;
		int n10000 = money / 10000;
		money %= 10000;
		int n5000 = money / 5000;
		money %= 5000;
		int n1000 = money / 1000;
		money %= 1000;
		int n500 = money / 500;
		money %= 500;
		int n100 = money / 100;
		money %= 100;
		int n50 = money / 50;
		money %= 50;
		int n10 = money / 10;
		money %= 10;
		int n5 = money / 5;
		money %= 5;
		int n1 = money /1;
		
		System.out.println("50000원:  " + n50000 + "개");
		System.out.println("10000원:  " + n10000 + "개");
		System.out.println(" 5000원:  " + n5000 + "개");
		System.out.println(" 1000원:  " + n1000 + "개");
		System.out.println("  500원:  " + n500 + "개");
		System.out.println("  100원:  " + n100 + "개");
		System.out.println("   50원:  " + n50 + "개");
		System.out.println("   10원:  " + n10 + "개");
		System.out.println("    5원:  " + n5 + "개");
		System.out.println("    1원:  " + n1 + "개");
		
		
		scanner.close();
 	}
}